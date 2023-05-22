
package javacb.btvn.cautrucrenhanh;

import java.util.Scanner;

public class PhuongTrinhBatNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, result;

        System.out.print("Nhap a: ");
        a = sc.nextDouble();

        System.out.print("Nhap b: ");
        b = sc.nextDouble();

        if (a == 0) {
            System.out.println("Phuong trinh vo nghiem");
        } else {
            result = -b / a;
            System.out.printf("Phuong trinh %.0fX + %.0f = 0 co nghiem la: %.2f", a, b, result);
        }

    }

}
