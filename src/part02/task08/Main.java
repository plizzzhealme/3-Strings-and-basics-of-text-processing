package part02.task08;

import static cleaner.Cleaner.getStringFromUser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        String s = getStringFromUser();
        String word = findLongestWord(s);
        System.out.println(String.format("The longest word:%n%s", word));
    }

    private static String findLongestWord(String s) {
        String[] words = s.split(" ");
        int l = words.length;

        if (l == 0) {
            return "";
        }
        int maxWordIndex = 0;

        for (int i = 1; i < l; i++) {
            if (words[i].length() > words[maxWordIndex].length()) {
                maxWordIndex = i;
            }
        }
        return words[maxWordIndex];
    }
}