package part03.task01;


import java.util.Arrays;
import java.util.Comparator;

import static part02.task05.Main.countMatches;

public class Main {
    private static final String LINE_SEPARATOR = "\r\n|[\n\r\u2028\u2029\u0085]";
    private static final String WORD_SEPARATOR = "\\p{javaWhitespace}+";
    private static final String SENTENCE_SEPARATOR = "[.!?]";

    public static void main(String[] args) {
        String text = "sadasd asd asd as asdasd. asdasd asd a sda sdasdasafgsfh. asdasdasd sad asd asd.\n" +
                      "asfkasfas  eqpotrwe asd;asd  asdoasd a asda!\n" +
                      "dasdasdaspdasdlas. asda sd a da sd eytqw-. qweqwr q  trqw. qrq   rq  wr q    w? qwrqwdsa." +
                      "asdasdas asdasd asd asd asd.\n";

        String[] paragraphs = getParagraphs(text);
        sortParagraphBySentenceNumber(paragraphs);

        for (String p : paragraphs) {
            String[] sentences = getSentences(p);

            for (String s : sentences) {
                System.out.println(s);
                String[] words = getWords(s);

                for (String w : words) {
                    System.out.println(w);
                }
            }
        }
    }

    private static String[] getParagraphs(String text) {
        String[] res = text.split(LINE_SEPARATOR);

        for (int i = 0; i < res.length; i++) {
            res[i] = res[i].trim();
        }
        return res;
    }

    private static String[] getSentences(String paragraph) {
        String[] res = paragraph.split(SENTENCE_SEPARATOR);

        for (int i = 0; i < res.length; i++) {
            res[i] = res[i].trim();
        }
        return res;
    }

    private static String[] getWords(String sentence) {
        return sentence.split(WORD_SEPARATOR);
    }

    private static void sortWordsByLength(String[] words) {
        Arrays.sort(words, Comparator.comparingInt(String::length));
    }

    private static void sortParagraphBySentenceNumber(String[] paragraphs) {
        Arrays.sort(paragraphs, Comparator.comparingInt(o -> getSentences(o).length));
    }

    private static void sortWordsByCharOccurrences(String[] words, char c) {
        Arrays.sort(words, (o1, o2) -> {
            int compareResult = countMatches(o2, c) - countMatches(o1, c);
            return compareResult != 0 ? compareResult : o2.compareTo(o1);
        });
    }
}
