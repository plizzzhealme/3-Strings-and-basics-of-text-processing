package part02.task05;

import static interaction.Interaction.getString;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        String s = getString();
        char c = 'a';
        int n = countMatches(s, c);
        System.out.println(String.format("The string contains %d a letters", n));
    }

    public static int countMatches(String s, char c) {
        int l = s.length();
        int count = 0;

        for (int i = 0; i < l; i++) {
            if (s.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }
}
