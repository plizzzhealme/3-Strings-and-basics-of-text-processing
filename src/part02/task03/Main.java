package part02.task03;

import static interaction.Interaction.getLine;

public class Main {
    public static void main(String[] args) {
        String s;
        boolean isPalindrome;

        System.out.println("Enter the string");
        s = getLine();
        isPalindrome = isPalindrome(s);
        System.out.println(isPalindrome ? "A palindrome" : "Not a palindrome");
    }

    private static boolean isPalindrome(String s) {
        s = s.replaceAll("\\s", "");
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}