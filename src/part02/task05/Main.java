package part02.task05;

import static cleaner.Cleaner.getStringFromUser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        String s = getStringFromUser();
        char c = 'a';
        int n = countMatches(s, c);
        System.out.println(String.format("The string contains %d a letters", n));
    }

    private static int countMatches(String s, char c) {
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
