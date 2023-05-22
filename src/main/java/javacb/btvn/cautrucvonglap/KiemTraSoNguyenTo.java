package javacb.btvn.cautrucvonglap;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap N: ");
        int N = sc.nextInt();

        boolean laSoNguyenTo = true;

        if (N <= 1) {
            laSoNguyenTo = false;
        } else {
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    laSoNguyenTo = false;
                    break;
                }
            }
        }

        if (laSoNguyenTo) {
            System.out.println(N + " la so nguyen to.");
        } else {
            System.out.println(N + " khong phai la so nguyen to.");
        }
    }
}
