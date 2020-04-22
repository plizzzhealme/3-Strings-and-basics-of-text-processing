package part02.task01;

import static interaction.Interaction.getLine;

public class Main {
    public static void main(String[] args) {
        String s;
        int max;

        System.out.println("Enter the string");
        s = getLine();
        System.out.println(s);
        max = countSpaces(s);
        System.out.printf("Max spaces in a row: %d", max);
    }

    private static int countSpaces(String s) {
        int length = s.length();
        int max = 0;
        int i = s.indexOf(' ');

        while (i >= 0) {
            int count = 1;
            i++;

            while (i < length && s.charAt(i) == ' ') {
                count++;
                i++;
            }
            max = Math.max(max, count);
            i = s.indexOf(' ', i);
        }
        return max;
    }
}