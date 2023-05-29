package javacb.btvn.mang;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;

        do {
            // Nhập số phần tử của mảng
            System.out.print("Nhap so phan tu cua mang: ");
            n = scanner.nextInt();

            // Kiểm tra giá trị n
            if (n < 1 || n > 20) {
                System.out.println("Gia tri n phai > 1 hoặc < 20.");
            }

        } while (n < 1 || n > 20);

        // Phát sinh mảng số nguyên ngẫu nhiên
        int[] mang = phatSinhMang(n);

        // a. Sắp xếp mảng tăng dần và xuất ra màn hình
        System.out.println("Mang truoc khi sap xep: " + Arrays.toString(mang));
        sapXepTangDan(mang);
        System.out.println("Mang sau khi sap xep tang dan: " + Arrays.toString(mang));

        // b. Nhập số nguyên x và liệt kê các phần tử là ước số của x
        System.out.print("Nhap so nguyen x: ");
        int x = scanner.nextInt();
        lietKeUocSo(mang, x);
    }

    // Phương thức phát sinh mảng số nguyên ngẫu nhiên
    public static int[] phatSinhMang(int n) {
        int[] mang = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            mang[i] = random.nextInt(20) + 1;
        }
        return mang;
    }

    // Phương thức sắp xếp mảng tăng dần
    public static void sapXepTangDan(int[] mang) {
        Arrays.sort(mang);
    }

    // Phương thức liệt kê các phần tử là ước số của x
    public static void lietKeUocSo(int[] mang, int x) {
        System.out.print("Cac phan tu la uoc so cua " + x + ": ");
        for (int i = 0; i < mang.length; i++) {
            if (x % mang[i] == 0) {
                System.out.print(mang[i] + " ");
            }
        }
        System.out.println();
    }
}
