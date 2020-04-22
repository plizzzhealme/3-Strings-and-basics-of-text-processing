package part02.task04;

public class Main {
    public static void main(String[] args) {
        String s = "информатика";
        String result = s.substring(7, 8).concat(s.substring(3, 5)).concat(s.substring(7, 8));

        System.out.println(result);
    }
}