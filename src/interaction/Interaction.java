package interaction;

import java.util.Scanner;

public class Interaction {
    private static final Scanner in = new Scanner(System.in);

    private Interaction() {
    }

    public static String getString() {
        return in.next();
    }

    public static String getLine() {
        return in.nextLine();
    }

    public static int getInt() {
        while (!in.hasNextInt()) {
            in.next();
            System.out.println("Enter an integer");
        }
        return in.nextInt();
    }

    public static int getPositiveInt() {
        int n;

        do {
            n = getInt();

            if (n <= 0) {
                System.out.println("Enter a positive integer");
            }
        } while (n <= 0);
        return n;
    }

    public static char getChar() {
        return in.next().charAt(0);
    }
}