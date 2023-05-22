package javacb.btvn.cautrucrenhanh;

import java.util.Scanner;

public class TinhTienTaxi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so km di taxi: ");
        int soKm = sc.nextInt();

        int gia1km = 15000; // Giá 1 km đầu
        int giaTuKm2Den5 = 13500; // Giá từ km thứ 2 đến km thứ 5
        int giaTuKm6TroDi = 11000; // Giá từ km thứ 6 trở đi

        int tongTien = 0;

        if (soKm <= 0) {
            System.out.println("So km nhap vao khong hop le.");
        } else if (soKm == 1) {
            tongTien = gia1km;
        } else if (soKm <= 5) {
            tongTien = gia1km + (soKm - 1) * giaTuKm2Den5;
        } else {
            tongTien = gia1km + 4 * giaTuKm2Den5 + (soKm - 5) * giaTuKm6TroDi;
        }

        if (soKm > 120) {
            double giamGia = 0.1 * tongTien;
            tongTien -= giamGia;
        }

        System.out.println("Tong tien di taxi: " + tongTien + "d");
    }
}
