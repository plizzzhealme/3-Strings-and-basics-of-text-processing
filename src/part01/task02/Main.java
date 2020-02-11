package part01.task02;

import static cleaner.Cleaner.getStringFromUser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        String s = getStringFromUser();
        System.out.println("Final string:");
        System.out.println(replace(s));

    }

    private static String replace(String s) {
        int strLen = s.length();
        char[] finalWord = new char[s.length() * 2];
        int finalWorldLength = 0;

        for (int i = 0; i < strLen; i++) {
            if (i < strLen - 3
                    && s.charAt(i) == 'w'
                    && s.charAt(i + 1) == 'o'
                    && s.charAt(i + 2) == 'r'
                    && s.charAt(i + 3) == 'd') {
                finalWord[finalWorldLength] = 'l';
                finalWord[finalWorldLength + 1] = 'e';
                finalWord[finalWorldLength + 2] = 't';
                finalWord[finalWorldLength + 3] = 't';
                finalWord[finalWorldLength + 4] = 'e';
                finalWord[finalWorldLength + 5] = 'r';
                i += 3;
                finalWorldLength += 6;
            } else {
                finalWord[finalWorldLength] = s.charAt(i);
                finalWorldLength += 1;
            }
        }
        return new String(finalWord, 0, finalWorldLength);
    }
}