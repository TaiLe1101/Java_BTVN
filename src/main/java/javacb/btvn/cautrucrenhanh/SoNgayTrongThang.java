package javacb.btvn.cautrucrenhanh;

import java.util.Scanner;

public class SoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap thang (1-12): ");
        int thang = sc.nextInt();

        int soNgay;

        if (thang == 1 || thang == 3 || thang == 5 || thang == 7 || thang == 8 || thang == 10 || thang == 12) {
            soNgay = 31;
        } else if (thang == 4 || thang == 6 || thang == 9 || thang == 11) {
            soNgay = 30;
        } else if (thang == 2) {
            System.out.print("Nhap nam: ");
            int nam = sc.nextInt();
            if ((nam % 4 == 0 && nam % 100 != 0) || nam % 400 == 0) {
                soNgay = 29;
            } else {
                soNgay = 28;
            }
        } else {
            System.out.println("Thang khong hop le!");
            return;
        }

        System.out.println("So ngay cua thang " + thang + " la: " + soNgay);
    }
}
