package part02.task05;

import static interaction.Interaction.getLine;

public class Main {
    public static void main(String[] args) {
        String s;
        char ch = 'a';
        int count;

        System.out.println("Enter the string");
        s = getLine();
        count = countChars(s, ch);
        System.out.printf("The string contains %d %c letters", count, ch);
    }

    public static int countChars(String s, char ch) {
        int count = 0;
        int i = s.indexOf(ch);

        while (i >= 0) {
            count++;
            i = s.indexOf(ch, i + 1);
        }
        return count;
    }
}