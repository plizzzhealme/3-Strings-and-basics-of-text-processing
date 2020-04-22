package part02.task06;

import static interaction.Interaction.getLine;

public class Main {
    public static void main(String[] args) {
        String s;
        String result;

        System.out.println("Enter the string");
        s = getLine();
        result = duplicateSymbols(s);
        System.out.println("Final string:");
        System.out.println(result);
    }

    private static String duplicateSymbols(String s) {
        int length = s.length();
        StringBuilder stringBuilder = new StringBuilder(length * 2);

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);
            stringBuilder.append(ch).append(ch);
        }
        return stringBuilder.toString();
    }
}