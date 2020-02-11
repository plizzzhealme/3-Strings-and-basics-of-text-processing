package part01.task03;

import static cleaner.Cleaner.getStringFromUser;
import static cleaner.Cleaner.print;

public class Main {
    public static void main(String[] args) {
        print("Enter the string");
        String s = getStringFromUser();
        print("The string contains " + countDigits(s) + " digits");
    }

    private static int countDigits(String s) {
        int count = 0;
        int length = s.length();

        for (int i = 0; i < length; i++) {
            if (Character.isDigit(s.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}