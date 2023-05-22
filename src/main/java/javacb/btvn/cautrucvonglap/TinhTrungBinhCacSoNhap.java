package javacb.btvn.cautrucvonglap;
import java.util.Scanner;

public class TinhTrungBinhCacSoNhap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng các số:");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];
        int sum = 0;

        System.out.println("Nhập các số:");

        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }

        double average = (double) sum / n;

        System.out.printf("Trung bình các số vừa nhập: %.3f", average);
    }
}

   
