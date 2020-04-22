package part01.task02;

import java.util.Arrays;

import static interaction.Interaction.getString;

public class Main {
    public static void main(String[] args) {
        char[] arr;
        char[] result;

        System.out.println("Enter the string");
        arr = getString().toCharArray();
        result = replace(arr, "word".toCharArray(), "letter".toCharArray());
        System.out.println("Final string:");
        System.out.println(result);

    }

    private static char[] replace(char[] arr, char[] target, char[] replacement) {
        int srcLength = arr.length;
        int targetLength = target.length;
        int replacementLength = replacement.length;
        int tempLength = 0;
        char[] temp = new char[Math.max(srcLength, srcLength * replacementLength / targetLength)];
        int i = 0;

        while (i < srcLength - targetLength + 1) {
            boolean matches = true;
            int j = 0;

            while (j < targetLength && matches) {
                if (arr[i + j] != target[j]) {
                    matches = false;
                }
                j++;
            }

            if (matches) {
                System.arraycopy(replacement, 0, temp, tempLength, replacementLength);
                i += targetLength;
                tempLength += replacementLength;
            } else {
                temp[tempLength++] = arr[i++];
            }
        }

        while (i < srcLength) {
            temp[tempLength++] = arr[i++];
        }
        return Arrays.copyOf(temp, tempLength);
    }
}