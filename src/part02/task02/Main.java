package part02.task02;

import static cleaner.Cleaner.getStringFromUser;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter the string");
        String s = getStringFromUser();
        System.out.println("Result string:");
        s = addBee(s);
        System.out.println(s);
    }

    private static String addBee(String s) {
        int l = s.length();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < l; i++) {
            char c = s.charAt(i);
            stringBuilder.append(c);

            if (c == 'a') {
                stringBuilder.append('b');
            }
        }
        return stringBuilder.toString();
    }
}