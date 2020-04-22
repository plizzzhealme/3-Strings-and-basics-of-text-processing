package part02.task08;

import static interaction.Interaction.getLine;

public class Main {
    public static void main(String[] args) {
        String s;
        String longestWord;

        System.out.println("Enter the string");
        s = getLine();
        longestWord = findLongestWord(s);
        System.out.printf("The longest word is %s", longestWord);
    }

    private static String findLongestWord(String s) {
        String[] words = s.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}