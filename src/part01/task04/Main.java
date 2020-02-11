package part01.task04;

import static cleaner.Cleaner.getStringFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter the string");
        String s = getStringFromUser();
        System.out.println(countNumbers(s));
    }

    public static int countNumbers(String s) {
        int count = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
                i++;

                while (i < length && Character.isDigit(s.charAt(i))) {
                    i++;
                }
            }
        }
        return count;
    }
}