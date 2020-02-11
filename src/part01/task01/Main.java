package part01.task01;

import static cleaner.Cleaner.getNaturalNumberFromUser;
import static cleaner.Cleaner.getStringFromUser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the number of variables you want to input");
        int length = getNaturalNumberFromUser();
        String[] variables = new String[length];

        for (int i = 0; i < length; i++) {
            variables[i] = getStringFromUser();
        }

        for (int i = 0; i < length; i++) {
            variables[i] = turnCamelIntoSnake(variables[i]);
        }

        for (int i = 0; i < length; i++) {
            System.out.println(variables[i]);
        }
    }

    private static String turnCamelIntoSnake(String s) {
        int strLen = s.length();
        int charLen = strLen * 2;
        char[] chars = new char[charLen];
        chars[0] = s.charAt(0);
        int charsIndex = 1;

        for (int i = 1; i < strLen; i++) {
            char currentChar = s.charAt(i);

            if (Character.isUpperCase(currentChar)) {
                chars[charsIndex] = '_';
                charsIndex++;
                chars[charsIndex] = Character.toLowerCase(currentChar);
                charsIndex++;
            } else {
                chars[charsIndex] = currentChar;
                charsIndex++;
            }
        }
        return String.valueOf(chars).trim();
    }
}