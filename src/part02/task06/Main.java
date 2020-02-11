package part02.task06;

import static cleaner.Cleaner.getStringFromUser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        String s = getStringFromUser();
        s = duplicateSymbols(s);
        System.out.println("Final string:");
        System.out.println(s);
    }

    private static String duplicateSymbols(String s) {
        int l = s.length();
        StringBuilder stringBuilder = new StringBuilder(l * 2);

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            stringBuilder.append(c).append(c);
        }
        return stringBuilder.toString();
    }
}
