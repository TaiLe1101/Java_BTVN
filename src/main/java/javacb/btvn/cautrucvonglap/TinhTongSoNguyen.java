package javacb.btvn.cautrucvonglap;

import java.util.Scanner;

public class TinhTongSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap N: ");
        int N = sc.nextInt();

        int tong = 0;

        for (int i = 1; i <= N; i++) {
            tong += i;
        }

        System.out.println("Tong cac so nguyen tu 1 den " + N + " la: " + tong);
    }
}
