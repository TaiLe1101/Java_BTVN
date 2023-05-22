package javacb.btvn.cautrucvonglap;

import java.util.Random;
import java.util.Scanner;

public class Bai15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(11);
        int guessCount = 0;
        int totalScore = 0;

        System.out.println("Tro choi doan so!");
        System.out.println("Nhap 1 so tu 0 toi 10 (-1 de ket thuc):");

        while (true) {
            int guess = scanner.nextInt();

            if (guess == -1) {
                break;
            }

            guessCount++;

            if (guess == randomNumber) {
                System.out.println("Co diem!");
                totalScore++;
            } else {
                System.out.println("Sai roi!");
            }
        }

        double averageScore = (double) totalScore / guessCount;

        System.out.println("Ket thuc tro choi!");
        System.out.println("Diem: " + totalScore);
        System.out.println("So lan doan: " + guessCount);
        System.out.printf("Ket qua doan trung trung binh: %.2f", averageScore);
    }
}
