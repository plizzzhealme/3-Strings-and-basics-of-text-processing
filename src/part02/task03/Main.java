package part02.task03;

import static cleaner.Cleaner.getStringFromUser;

public class Main {
    public static void main(String[] args) {
        String s = getStringFromUser();
        System.out.println(isPalindrome(s) ? "Yes" : "No");
    }

    private static boolean isPalindrome(String s) {
        s = s.replaceAll("\\W", "");
        return s.equalsIgnoreCase(new StringBuilder(s).reverse().toString());
    }
}
