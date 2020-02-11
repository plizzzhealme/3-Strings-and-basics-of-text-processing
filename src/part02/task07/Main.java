package part02.task07;

import static cleaner.Cleaner.getStringFromUser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        String s = getStringFromUser();
        s = removeDuplicatesAndSpaces(s);
        System.out.println("Final string:");
        System.out.println(s);
    }

    private static String removeDuplicatesAndSpaces(String s) {
        int l = s.length();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);

            if (s.indexOf(c, i + 1) == -1
                    && c != ' ') {
                stringBuilder.append(c);
            }
        }
        return stringBuilder.toString();
    }
}
