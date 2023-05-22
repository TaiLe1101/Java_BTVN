package javacb.btvn.cautrucrenhanh;

import java.util.Scanner;

public class TimSoNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;

        System.out.print("Nhap a: ");
        a = sc.nextInt();
        System.out.print("Nhap b: ");
        b = sc.nextInt();
        System.out.print("Nhap c: ");
        c = sc.nextInt();

        int soNhoNhat = a; 

        if (b < soNhoNhat) {
            soNhoNhat = b;
        }

        if (c < soNhoNhat) {
            soNhoNhat = c;
        }

        System.out.println(soNhoNhat);
    }
}
