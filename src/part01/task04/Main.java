package part01.task04;

import static interaction.Interaction.getString;
import static interaction.Interaction.print;

public class Main {
    public static void main(String[] args) {
        char[] arr;
        int result;

        print("Enter the string");
        arr = getString().toCharArray();
        result = countNumbers(arr);
        System.out.printf("The string contains %d numbers", result);
    }

    public static int countNumbers(char[] arr) {
        int length = arr.length;
        int count = 0;
        int i = 0;

        while (i < length) {
            if (Character.isDigit(arr[i])) {
                count++;
                i++;

                while (i < length && Character.isDigit(arr[i])) {
                    i++;
                }
            }
            i++;
        }
        return count;
    }
}