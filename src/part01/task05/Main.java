package part01.task05;

import static cleaner.Cleaner.getStringFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter the string");
        String s = getStringFromUser();
        System.out.println("Final string:");
        System.out.println(removeSpaces(s));
    }

    private static String removeSpaces(String s) {
        int length = s.length();
        int first = getFirstIndex(s);

        if (first == length) {
            return "";
        }
        int last = getLastIndex(s);

        if (last == first) {
            return String.valueOf(s.charAt(first));
        }
        int finalLength = 0;
        char[] result = new char[last - first + 1];

        for (int i = first; i <= last; i++) {
            result[finalLength] = s.charAt(i);
            finalLength++;

            if (s.charAt(i) == ' ') {
                while (s.charAt(i) == ' ') {
                    i++;
                }
                i--;
            }
        }
        return String.valueOf(result, 0, finalLength);
    }

    private static int getFirstIndex(String s) {
        int l = s.length();
        int first = 0;

        while (first < l && s.charAt(first) == ' ') {
            first++;
        }
        return first;
    }

    private static int getLastIndex(String s) {
        int last = s.length() - 1;

        while (last >= 0 && s.charAt(last) == ' ') {
            last--;
        }
        return last;
    }
}