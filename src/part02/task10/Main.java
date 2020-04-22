package part02.task10;

import static interaction.Interaction.getLine;

public class Main {
    public static void main(String[] args) {
        String s;
        int count;

        System.out.println("Enter the string");
        s = getLine();
        count = countSentences(s);
        System.out.printf("The string contains %d sentences", count);
    }

    private static int countSentences(String s) {
        int length = s.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);

            if (ch == '.' || ch == '!' || ch == '?') {
                count++;
            }
        }
        return count;
    }
}