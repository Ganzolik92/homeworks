import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        StringBuilder result = new StringBuilder();
        switch (x / 100) {
            case 1: result.append("C"); break;
        }
        switch (x / 10 % 10) {
            case 1: result.append("X");  break;
            case 2: result.append("XX"); break;
            case 3: result.append("XXX"); break;
            case 4: result.append("XL"); break;
            case 5: result.append("L");  break;
            case 6: result.append("LX"); break;
            case 7: result.append("LXX"); break;
            case 8: result.append("LXXX"); break;
            case 9: result.append("XC"); break;
        }
        switch (x % 10) {
            case 1: result.append("I");  break;
            case 2: result.append("II"); break;
            case 3: result.append("III"); break;
            case 4: result.append("IV"); break;
            case 5: result.append("V");  break;
            case 6: result.append("VI"); break;
            case 7: result.append("VII"); break;
            case 8: result.append("VIII"); break;
            case 9: result.append("IX"); break;
        }
        System.out.println(result);
    }
}