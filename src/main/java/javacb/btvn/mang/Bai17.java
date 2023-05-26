package javacb.btvn.mang;

import java.util.Scanner;

public class Bai17 {
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

        double soTrungBinh = tinhSoTrungBinh(list);
        System.out.println("\nSo trung binh: " + soTrungBinh);

        int phanTuNhoNhat = timPhanTuNhoNhat(list);
        System.out.println("Phan tu nho nhat trong mang: " + phanTuNhoNhat);

    }

    private static int timPhanTuNhoNhat(int[] list) {
        int phanTuNhoNhat = list[0];
        for (int i = 1; i < list.length; i++) {
            phanTuNhoNhat = Math.min(phanTuNhoNhat, list[i]);
        }
        return phanTuNhoNhat;
    }

    private static double tinhSoTrungBinh(int[] list) {
        double soTrungBinh = 0;
        int tong = 0;

        for (int item : list) {
            tong += item;
        }

        soTrungBinh = (double) tong / list.length;

        return soTrungBinh;
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
