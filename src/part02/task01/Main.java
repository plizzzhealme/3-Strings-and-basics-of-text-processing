package part02.task01;

import static cleaner.Cleaner.getStringFromUser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        String s = getStringFromUser();
        System.out.println("Max spaces in a row: " + countSpaces(s));
    }

    private static int countSpaces(String s) {
        int last = s.lastIndexOf(' ');

        if (last == -1) {
            return 0;
        }

        int i = s.indexOf(' ');

        if (i == last) {
            return 1;
        }
        int max = 0;
        int count = 0;

        while (i <= last) {
            if (s.charAt(i) == ' ') {
                count++;
                i++;
            } else {
                max = Math.max(max, count);
                i = s.indexOf(' ', i);
                count = 0;
            }
        }

        return Math.max(max, count);
    }
}
