package ss5_loop;

import java.util.Scanner;

public class Exercise21B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhập số nguyên dương n : ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println(" Nhập sai vui lòng nhập lại!! ");
            }
        } while (n <= 0);

        if (n < 2) {
            System.out.println(n + " không phải là số nguyên tố.");
        } else {
            int count = 0;
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.println(n + " là số nguyên tố.");
            } else {
                System.out.println(n + " không phải là số nguyên tố.");
            }
        }
    }
}
