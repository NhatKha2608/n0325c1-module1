package ss5_loop;

import java.util.Scanner;

public class Exercise21C {
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

        int lastDigit = 10;

        while (n > 0) {
            int digit = n % 10;
            if (digit >= lastDigit) {
                System.out.println("Số này không có các chữ số tăng dần.");
                return;
            }
            lastDigit = digit;
            n /= 10;
        }

        System.out.println("Số này có các chữ số tăng dần.");
    }
}
