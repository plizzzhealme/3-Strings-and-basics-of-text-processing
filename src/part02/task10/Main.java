package part02.task10;

import static cleaner.Cleaner.getStringFromUser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        String s = getStringFromUser();
        int count = countSentences(s);
        System.out.println(String.format("The string contains %d sentences", count));
    }

    private static int countSentences(String s) {
        int l = s.length();
        int count = 0;

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);

            if (c == '.' || c == '!' || c == '?') {
                count++;
            }
        }
        return count;
    }
}