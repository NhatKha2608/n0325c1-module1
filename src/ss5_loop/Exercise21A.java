package ss5_loop;

import java.util.Scanner;

public class Exercise21A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập số nguyên dương n : ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println(" Nhập sai vui lòng nhập lại ");
            }
        } while (n <= 0);

        int reverse =0;
        int original =n ;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        if (original == reverse) {
            System.out.println( original + " là số đối xứng.");
        } else {
            System.out.println( original + " không phải là số đối xứng.");
        }

    }
}
