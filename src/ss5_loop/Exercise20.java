package ss5_loop;

import java.util.Scanner;

public class Exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.print("Nhập số nguyên dương a : ");
            a = scanner.nextInt();
            if (a <= 0) {
                System.out.println(" Nhap sai vui long nhap lai ");
            }
        } while (a <= 0);

        int b;
        do {
            System.out.print("Nhập số nguyên dương b : ");
            b = scanner.nextInt();
            if (b <= 0) {
                System.out.println(" Nhap sai vui long nhap lai ");
            }
        } while (b <= 0);

        int c;
        do {
            System.out.print("Nhập số nguyên dương c : ");
            c = scanner.nextInt();
            if (c <= 0) {
                System.out.println(" Nhap sai vui long nhap lai ");
            }
        } while (c <= 0);

        int factorialA = 1;
        for (int i = 1; i <= a; i++) {
            factorialA *= i;

        }

        int factorialB = 1;
        for (int i = 1; i <= b; i++) {
            factorialB *= i;
        }

        int factorialC = 1;
        for (int i = 1; i <= c; i++) {
            factorialC *= i;
        }

        int s = factorialA + factorialB + factorialC;
        System.out.println("S = " + s);

    }
}
