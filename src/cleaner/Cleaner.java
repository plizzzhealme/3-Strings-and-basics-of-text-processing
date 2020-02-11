package cleaner;

import java.util.Scanner;

public class Cleaner {

    /*
    GENERATORS
     */

    /*
    PRINTS
     */

    public static void print(String s) {
        System.out.println(s);
    }

    /*
    SCANNERS
     */

    public static String getStringFromUser() {
        Scanner in = new Scanner(System.in);
        return in.nextLine();
    }

    public static int getIntFromUser() {
        Scanner in = new Scanner(System.in);

        while (!in.hasNextInt()) {
            in.next();
            print("Enter an integer");
        }
        return in.nextInt();
    }

    public static int getNaturalNumberFromUser() {
        while (true) {
            int n = getIntFromUser();

            if (n > 0) {
                return n;
            } else {
                print("Enter a positive integer");
            }
        }
    }
}