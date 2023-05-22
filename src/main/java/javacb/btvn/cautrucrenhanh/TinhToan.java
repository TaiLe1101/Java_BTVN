package javacb.btvn.cautrucrenhanh;

import java.util.Scanner;

public class TinhToan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so thu nhat: ");
        int so1 = sc.nextInt();
        System.out.print("Nhap so thu hai: ");
        int so2 = sc.nextInt();
        System.out.print("Nhap phep toan (+, -, *, /): ");
        String phepToan = sc.next();

        if (phepToan.equals("+")) {
            int tong = so1 + so2;
            System.out.println("Tong: " + tong);
        } else if (phepToan.equals("-")) {
            int hieu = so1 - so2;
            System.out.println("Hieu: " + hieu);
        } else if (phepToan.equals("*")) {
            int tich = so1 * so2;
            System.out.println("Tich: " + tich);
        } else if (phepToan.equals("/")) {
            if (so2 != 0) {
                double thuong = (double) so1 / so2;
                System.out.println("Thuong: " + thuong);
            } else {
                System.out.println("Khong the chia cho 0!!");
            }
        } else {
            System.out.println("Phep toan khong hop le.");
        }
    }
}
