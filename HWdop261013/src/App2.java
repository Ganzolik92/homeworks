import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (a < 1 || a > 12 || b < 1 || b > days[a]) {
            System.out.println(-1);
            return;
        }
        int passed = 0;
        for (int i = 1; i < a; i++) {
            passed += days[i];
        }
        passed += b;

        System.out.println(365 - passed);
    }
}