package ss6_method;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = scanner.nextInt();
        if (isPrime(n)) {
            System.out.println("n là số nguyên tố");
        } else System.out.println("n ko phải là số nguyên tố ");

        System.out.println( "Tổng : " + sumPrime(n));

    }

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int sumPrime(int n) {
        int total = 0;
        while (n != 0) {
            if (isPrime(n % 10)) {
                total += n % 10;
            }
            n /= 10;
        }
        return total;
    }
}

