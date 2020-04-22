package part02.task02;

import static interaction.Interaction.getString;

public class Main {
    public static void main(String[] args) {
        String s;
        String result;

        System.out.println("Enter the string");
        s = getString();
        result = s.replace("a", "ab");
        System.out.println("Final string:");
        System.out.println(result);
    }
}