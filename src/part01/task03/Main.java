package part01.task03;

import static interaction.Interaction.getString;
import static interaction.Interaction.print;

public class Main {
    public static void main(String[] args) {
        char[] arr;
        int result;

        print("Enter the string");
        arr = getString().toCharArray();
        result = countDigits(arr);
        System.out.printf("The string contains %d digits", result);
    }

    private static int countDigits(char[] arr) {
        int count = 0;

        for (char c : arr) {
            if (Character.isDigit(c)) {
                count++;
            }
        }
        return count;
    }
}