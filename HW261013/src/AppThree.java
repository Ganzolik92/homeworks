import java.util.Scanner;

public class AppThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lastTwo = n % 100;
        int lastOne = n % 10;
        if (lastTwo >= 11 && lastTwo <= 14) {
            System.out.println(n + " TORTOV");
        } else if (lastOne == 1) {
            System.out.println(n + " TORT");
        } else if (lastOne >= 2 && lastOne <= 4) {
            System.out.println(n + " TORTA");
        } else {
            System.out.println(n + " TORTOV");
        }
    }
}