package javacb.btvn.cautrucvonglap;
import java.util.Scanner;

public class DemUocSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap N: ");
        int N = sc.nextInt();

        int demUocSo = 0;

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                demUocSo++;
            }
        }

        System.out.println("So uoc so cua " + N + " la: " + demUocSo);
    }
}
