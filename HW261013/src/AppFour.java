import java.util.Scanner;

public class AppFour{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();

        if (A == 0) {
            if (B > 0) System.out.println("any x");
            else       System.out.println("no such x");
        } else if (A > 0) {
            if (B > 0) {
                System.out.println("any x");
            } else {
                double c = -B / A;
                if (c == 0) {
                    System.out.printf("x<%.1f or x>%.1f%n", c, c);
                } else {
                    System.out.printf("x<%.1f or x>%.1f%n", -c, c);
                }
            }
        } else {
            if (B < 0) {
                System.out.println("no such x");
            } else {
                double c = -B / A;
                if (c == 0) {
                    System.out.println("no such x");
                } else {
                    System.out.printf("%.1f<x<%.1f%n", -c, c);
                }
            }
        }
    }
}