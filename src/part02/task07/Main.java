package part02.task07;

import static interaction.Interaction.getLine;

public class Main {
    public static void main(String[] args) {
        String s;
        String result;

        System.out.println("Enter the string");
        s = getLine();
        result = removeDuplicatesAndSpaces(s);
        System.out.println("Final string:");
        System.out.println(result);
    }

    private static String removeDuplicatesAndSpaces(String s) {
        int length = s.length();
        StringBuilder stringBuilder = new StringBuilder(length);

        for (int i = 0; i < length; i++) {
            char ch = s.charAt(i);

            if (s.indexOf(ch, i + 1) == -1 && ch != ' ') {
                stringBuilder.append(ch);
            }
        }
        return stringBuilder.toString();
    }
}