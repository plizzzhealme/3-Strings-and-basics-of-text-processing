package part01.task05;

import java.util.Arrays;

import static interaction.Interaction.getLine;

public class Main {
    public static void main(String[] args) {
        char[] arr;
        char[] result;

        System.out.println("Enter the string");
        arr = getLine().toCharArray();
        result = removeSpaces(arr);
        System.out.println(result);
    }

    private static char[] removeSpaces(char[] arr) {
        int length = arr.length;
        char[] temp;
        int tempIndex = 0;
        int i = 0;

        while (i < length && arr[i] <= ' ') {
            i++;
        }

        while (i < length && arr[length - 1] <= ' ') {
            length--;
        }

        temp = new char[length - i];

        while (i < length) {
            temp[tempIndex++] = arr[i];

            if (arr[i++] <= ' ') {
                while (arr[i] <= ' ') {
                    i++;
                }
            }
        }
        return Arrays.copyOf(temp, tempIndex);
    }
}