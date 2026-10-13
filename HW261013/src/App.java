import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (x >= 0 && x <= 9) {
            System.out.println("DIGIT");
        } else if (x >= 10 && x <= 99) {
            System.out.println("NUM");
        } else {
            System.out.println("OTHER");
        }
    }
}