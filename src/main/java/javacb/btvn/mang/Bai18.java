package javacb.btvn.mang;

import java.util.Scanner;

public class Bai18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int list[];
        int n;

        do {
            System.out.print("Nhap so luong pha tu: ");
            n = sc.nextInt();
            list = new int[n];

        } while (n < 1 && n > 20);

        nhapMang(list);
        System.out.println("--------------------------------");

        xuatMang(list);

        timPhanTuKhongPhaiSoNguyenTo(list);

        double trungBinhSoNguyenTo = tinhTrungBinhCacSoNguyenTo(list);
        System.out.println("\nSo trung binh cac so nguyen to trong mang la: " + trungBinhSoNguyenTo);
    }

    private static double tinhTrungBinhCacSoNguyenTo(int[] list) {
        int tong = 0;
        double soTrungBinh = 0;
        int dem = 0;

        for (int i = 0; i < list.length; i++) {
            if (demUocSo(list[i]) == 2) {
                tong += list[i];
                dem++;
            }
        }

        soTrungBinh = (double) tong / (double) dem;

        return soTrungBinh;
    }

    private static void timPhanTuKhongPhaiSoNguyenTo(int[] list) {
        System.out.print("\nphan tu khong phai so nguyen to: ");
        for (int i = 0; i < list.length; i++) {
            if (demUocSo(list[i]) != 2) {
                System.out.print(list[i] + " ");
            }
        }

    }

    private static int demUocSo(int n) {
        int demUocSo = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                demUocSo++;
            }
        }
        return demUocSo;
    }

    private static void xuatMang(int[] list) {
        System.out.print("Mang: ");

        for (int item : list) {
            System.out.print(item + " ");
        }
    }

    private static void nhapMang(int[] list) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < list.length; i++) {
            System.out.print("Nhap phan tu item[" + i + "]: ");
            list[i] = sc.nextInt();
        }
    }
}
