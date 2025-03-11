package ss5_loop;

import java.util.Scanner;

public class Exercise16E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Nhập chiều dài cạnh : ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println(" Nhap sai vui long nhap lai ");
            }
        } while (n <= 0);

        int j;
        for (int i = 1; i <= n; i++) {
            for (j = 1; j <= n - i + 1; j++) {
                if (i == 1 || j == 1 || j == n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
