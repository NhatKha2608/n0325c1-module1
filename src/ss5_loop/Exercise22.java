package ss5_loop;

import java.util.Scanner;

public class Exercise22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;

        do {
            System.out.print("Nhập số nguyên dương a : ");
            a = scanner.nextInt();
            if (a <= 0) {
                System.out.println(" Nhập sai vui lòng nhập lại ");
            }
        } while (a <= 0);

        do {
            System.out.print("Nhập số nguyên dương b : ");
            b = scanner.nextInt();
            if (b <= a) {
                System.out.println("Nhập sai vui lòng nhập lại ");
            }
        } while (b <= a);

        // số đối xứng
        int sumPalindrome = 0;
        int countPalindrome = 0;
        for (int i = a; i <= b; i++) {
            int original = i, reverse = 0, temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                reverse = reverse * 10 + digit;
                temp /= 10;
            }

            if (original == reverse) {
                sumPalindrome += original;
                countPalindrome++;
            }
        }


        // số chính phương
        int sumPerfectSquares = 0;
        int countPerfectSquares = 0;
        for (int i = a; i <= b; i++) {
            double squareRoot = Math.sqrt(i);
            if (squareRoot % 1 == 0) {
                sumPerfectSquares += i;
                countPerfectSquares++;
            }
        }

        // số nguyên tố
        int sumPrime = 0;
        int countPrime = 0;
        for (int i = a; i <= b; i++) {
            if (i < 2) continue;
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                sumPrime += i;
                countPrime++;
            }
        }
        System.out.printf("Có %d số đối xứng trong [%d,%d].Tổng là : %d \n", countPalindrome,a,b, sumPalindrome);
        System.out.printf("Có %d số chính phương trong [%d,%d]. Tổng là : %d \n", countPerfectSquares,a,b,sumPerfectSquares);
        System.out.printf("Có %d số nguyên tố trong [%d,%d].Tổng là : %d  \n", countPrime,a,b, sumPrime);
    }
}
