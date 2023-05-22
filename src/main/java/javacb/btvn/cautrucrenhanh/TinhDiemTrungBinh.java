package javacb.btvn.cautrucrenhanh;

import java.util.Scanner;

public class TinhDiemTrungBinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double diemToan, diemVan, diemAnh, diemTB;
        String hocLuc;

        System.out.print("Nhap diem toan: ");
        diemToan = sc.nextDouble();
        System.out.print("Nhap diem van: ");
        diemVan = sc.nextDouble();
        System.out.print("Nhap diem anh: ");
        diemAnh = sc.nextDouble();

        diemTB = (diemToan + diemVan + diemAnh) / 3;

        if (diemTB > 8 && diemTB <= 10) {
            hocLuc = "Gioi";
        } else if (diemTB > 6.5 && diemTB <= 8) {
            hocLuc = "Kha";
        } else if (diemTB > 4 && diemTB <= 6.5) {
            hocLuc = "Trung Binh";
        } else {
            hocLuc = "Yeu";
        }

        System.out.printf("Diem trung binh: %.2f\nHoc luc: %s", diemTB, hocLuc);
    }
}