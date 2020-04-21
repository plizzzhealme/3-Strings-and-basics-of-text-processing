package part01.task01;

import java.util.Arrays;

import static interaction.Interaction.getPositiveInt;
import static interaction.Interaction.getString;

public class Main {
    public static void main(String[] args) {
        int length;
        char[][] camels;
        char[][] snakes;

        System.out.println("Enter the number of variables");
        length = getPositiveInt();
        camels = new char[length][];
        System.out.println("Enter variable names");

        for (int i = 0; i < length; i++) {
            camels[i] = getString().toCharArray();
        }
        snakes = new char[length][];

        for (int i = 0; i < length; i++) {
            snakes[i] = toSnake(camels[i]);
        }

        for (char[] snake : snakes) {
            System.out.println(snake);
        }
    }

    private static char[] toSnake(char[] camel) {
        int camelLength = camel.length;
        char[] temp = new char[camelLength * 2];
        int tempIndex = 1;
        temp[0] = camel[0];

        for (int i = 1; i < camelLength; i++) {
            if (Character.isUpperCase(camel[i])) {
                temp[tempIndex++] = '_';
                temp[tempIndex++] = Character.toLowerCase(camel[i]);
            } else {
                if (Character.isDigit(camel[i]) && Character.isLetter(camel[i - 1])) {
                    temp[tempIndex++] = '_';
                }
                temp[tempIndex++] = camel[i];
            }
        }
        return Arrays.copyOf(temp, tempIndex);
    }
}