package part03.task01;

import java.util.Arrays;
import java.util.Comparator;

import static interaction.Interaction.getChar;
import static interaction.Interaction.getPositiveInt;

public class Main {

    public static void main(String[] args) {
        String in = "in computer science, pattern matching is the act of checking a given sequence of tokens " +
                    "for the presence of the constituents of some pattern. In contrast to pattern recognition, " +
                    "the match usually has to be exact: either it will or will not be a match. The patterns " +
                    "generally have the form of either sequences or tree structures. Uses of pattern matching " +
                    "include outputting the locations of a pattern within a token sequence, to output some " +
                    "component of the matched pattern, and to substitute the matching pattern with some other " +
                    "token sequence.\n" +
                    " Sequence patterns are often described using regular expressions and matched using techniques " +
                    "such as backtracking.\n" +
                    "Tree patterns are used in some programming languages as a general tool to process data " +
                    "based on its structure. For simplicity and efficiency reasons, these tree patterns lack some " +
                    "features that are available in regular expressions.";
        String[][][] text = splitText(in);
        boolean workFlag = true;

        while (workFlag) {
            System.out.println("Pick an option:\n" +
                               "1. Sort paragraphs by number of sentences\n" +
                               "2. Sort words by length\n" +
                               "3. Sort words by char occurrences\n" +
                               "4. Print text\n" +
                               "5. Exit");
            int option = getPositiveInt();

            switch (option) {
                case 1:
                    sortParagraphs(text);
                    break;
                case 2:
                    sortWordsByLength(text);
                    break;
                case 3:
                    System.out.println("Enter character");
                    sortWordsByCharOccurrences(text, getChar());
                    break;
                case 4:
                    printText(text);
                    break;
                case 5:
                    workFlag = false;
                    break;
                default:
                    System.out.println("No such option");
            }
        }
    }

    private static void sortParagraphs(String[][][] text) {
        Arrays.sort(text, Comparator.comparingInt(paragraph -> paragraph.length));
    }

    private static void sortWordsByLength(String[][][] text) {
        for (String[][] paragraph : text) {
            for (String[] sentence : paragraph) {
                Arrays.sort(sentence, Comparator.comparingInt(String::length));
            }
        }
    }

    private static void sortWordsByCharOccurrences(String[][][] text, char ch) {
        for (String[][] paragraph : text) {
            for (String[] sentence : paragraph) {
                Arrays.sort(sentence, (word1, word2) -> {
                    int result = part02.task05.Main.countChars(word2, ch)
                                 - part02.task05.Main.countChars(word1, ch);
                    return result != 0 ? result : word1.compareToIgnoreCase(word2);
                });
            }
        }
    }

    private static void printText(String[][][] text) {
        for (String[][] paragraph : text) {
            for (String[] sentence : paragraph) {
                System.out.println(Arrays.toString(sentence));
            }
            System.out.println();
        }
    }

    private static String[][][] splitText(String text) {
        String[][][] result;

        String[] paragraphs = splitIntoParagraphs(text);
        result = new String[paragraphs.length][][];

        for (int p = 0; p < paragraphs.length; p++) {
            String[] sentences = splitIntoSentences(paragraphs[p]);
            result[p] = new String[sentences.length][];

            for (int s = 0; s < sentences.length; s++) {
                result[p][s] = splitIntoWords(sentences[s].trim());
            }
        }
        return result;
    }

    private static String[] splitIntoParagraphs(String text) {
        return text.split("\r\n|[\n\r\u2028\u2029\u0085]");
    }

    private static String[] splitIntoSentences(String paragraph) {
        return paragraph.split("[.!?]");
    }

    private static String[] splitIntoWords(String sentence) {
        return sentence.split("(?U)\\W+");
    }
}