package part01.task03;

import static interaction.Interaction.getString;

public class Main {
    public static void main(String[] args) {
        char[] arr;
        int count;

        System.out.println("Enter the string");
        arr = getString().toCharArray();
        count = countDigits(arr);
        System.out.printf("The string contains %d digits", count);
    }

    private static int countDigits(char[] arr) {
        int count = 0;

        for (char ch : arr) {
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }
}