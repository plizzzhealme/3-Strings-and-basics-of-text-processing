package part02.task09;

import static interaction.Interaction.getString;

public class Main {
    public static void main(String[] args) {
        String s;
        int upperCount;
        int lowerCount;

        System.out.println("Enter the string");
        s = getString();
        upperCount = countUpperCase(s);
        lowerCount = countLowerCase(s);
        System.out.printf("UpperCase: %d LowerCase: %d", upperCount, lowerCount);
    }

    private static int countUpperCase(String s) {
        int length = s.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);

            if ('A' <= ch && ch <= 'Z') {
                count++;
            }
        }
        return count;
    }

    private static int countLowerCase(String s) {
        int length = s.length();
        int count = 0;

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);

            if ('a' <= ch && ch <= 'z') {
                count++;
            }
        }
        return count;
    }
}