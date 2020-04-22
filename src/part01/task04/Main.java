package part01.task04;

import static interaction.Interaction.getString;

public class Main {
    public static void main(String[] args) {
        char[] arr;
        int count;

        System.out.println("Enter the string");
        arr = getString().toCharArray();
        count = countNumbers(arr);
        System.out.printf("The string contains %d numbers", count);
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