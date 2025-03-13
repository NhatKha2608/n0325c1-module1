package ss6_method;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = scanner.nextInt();

        System.out.println("Câu a : S = "+ sumN(n));
        System.out.println("Câu b : S = "+ sumOfSquares(n));
        System.out.println("Câu c : S = "+ sumInverse(n));
        System.out.println("Câu d : S = "+ factorial(n));
        System.out.println("Câu e : S = "+ sumFactorial(n));


    }

    // a. Tính tổng S = 1 + 2 + ... + n
    public static int sumN(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // b. Tính tổng S = 1² + 2² + ... + n²
    public static int sumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i;
        }
        return sum;
    }

    // c. Tính tổng S = 1 + 1/2 + 1/3 + ... + 1/n
    public static double sumInverse(int n) {
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }


    // d. Tính tích S = 1 * 2 * ... * n
    public static long factorial(int n) {
        long product = 1;
        for (int i = 1; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    // e. Tính tổng S = 1! + 2! + ... + n!
    public static long sumFactorial(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += factorial(i);
        }
        return sum;
    }

}
