package javacb.btvn.cautrucvonglap;
import java.util.Scanner;

public class TimSoLonNhatVaNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxDigit = Integer.MIN_VALUE;
        int minDigit = Integer.MAX_VALUE;

        while (n > 0) {
            int digit = n % 10;
            maxDigit = Math.max(maxDigit, digit);
            minDigit = Math.min(minDigit, digit);
            n = n / 10;
        }

        System.out.println("Chu so lon nhat: " + maxDigit);
        System.out.println("Chu so nho nhat: " + minDigit);
    }
}



