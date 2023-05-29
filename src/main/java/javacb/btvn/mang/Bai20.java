package javacb.btvn.mang;

import java.util.Scanner;

public class Bai20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhap so phan tu cua mang: ");
        int n = scanner.nextInt();

        // Khởi tạo mảng a có n phần tử
        int[] a = new int[n];

        // Nhập các phần tử của mảng
        nhapMang(a, scanner);

        // Nhập số nguyên x
        System.out.print("Nhap so nguyen x: ");
        int x = scanner.nextInt();

        // Kiểm tra x có xuất hiện trong mảng a và vị trí đầu tiên nào
        boolean found = kiemTraXuatHien(a, x);
        int firstIndex = timViTriDauTien(a, x);

        if (found) {
            System.out.println("So " + x + " xuat hien trong mang a tai vi tri dau tien: " + firstIndex);
        } else {
            System.out.println("So " + x + " khong xuat hien trong mang a.");
        }

        // Kiểm tra mảng có tính chất tăng dần không
        boolean isIncreasing = kiemTraTangDan(a);

        if (isIncreasing) {
            System.out.println("Mang a co tinh chat tang dan.");
        } else {
            System.out.println("Mang a khong co tinh chat tang dan.");
        }
    }

    // Phương thức nhập mảng
    public static void nhapMang(int[] arr, Scanner scanner) {
        System.out.println("Nhap cac phan tu cua mang:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = scanner.nextInt();
        }
    }

    // Phương thức kiểm tra x có xuất hiện trong mảng a hay không
    public static boolean kiemTraXuatHien(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return true;
            }
        }
        return false;
    }

    // Phương thức tìm vị trí đầu tiên của x trong mảng a
    public static int timViTriDauTien(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // Phương thức kiểm tra mảng có tính chất tăng dần không
    public static boolean kiemTraTangDan(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
