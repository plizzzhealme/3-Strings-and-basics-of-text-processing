package part02.task09;

import static cleaner.Cleaner.getStringFromUser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        String s = getStringFromUser();
        int lowerCase = countLowerCase(s);
        int upperCase = countUpperCase(s);
        System.out.println(String.format("UpperCase: %d%nLowerCase: %d", upperCase, lowerCase));
    }

    private static int countUpperCase(String s) {
        int l = s.length();
        int count = 0;

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                count++;
            }
        }
        return count;
    }

    private static int countLowerCase(String s) {
        int l = s.length();
        int count = 0;

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);

            if (c >= 'a' && c <= 'z') {
                count++;
            }
        }
        return count;
    }
}
