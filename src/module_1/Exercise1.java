package module_1;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập n : ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Nhâp sai vui lòng nhập lại n>=0");
            }
        } while (n < 0);

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
