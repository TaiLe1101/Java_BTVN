package javacb.btvn.mang;

import java.util.Scanner;

public class Bai16 {
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

        int tong = tinhTong(list);
        System.out.println("\nTong: " + tong);

        int soLuongSoLe = demSoLe(list);
        System.out.println("So luong phan tu le: " + soLuongSoLe);

        int phanTuLonNhat = timPhanTuLonNhat(list);
        System.out.println("Phan tu lon nhat trong mang: " + phanTuLonNhat);

    }

    private static int timPhanTuLonNhat(int[] list) {
        int phanTuLonNhat = list[0];
        for (int i = 1; i < list.length; i++) {
            phanTuLonNhat = Math.max(phanTuLonNhat, list[i]);

        }
        return phanTuLonNhat;
    }

    private static int demSoLe(int[] list) {
        int dem = 0;

        for (int item : list) {
            if (item % 2 != 0) {
                dem++;
            }
        }

        return dem;
    }

    private static int tinhTong(int[] list) {

        int tong = 0;

        for (int item : list) {
            tong += item;
        }

        return tong;
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
