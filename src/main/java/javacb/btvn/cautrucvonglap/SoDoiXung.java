package javacb.btvn.cautrucvonglap;

import java.util.Scanner;
public class SoDoiXung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int temp = n;
        int reverse = 0;

        while (temp > 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }

        if (n == reverse) {
            System.out.println(n + " la so doi xung");
        } else {
            System.out.println(n + " khong la so doi xung");
        }
    }
}

