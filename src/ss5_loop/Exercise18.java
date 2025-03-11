package ss5_loop;

import java.util.Scanner;

public class Exercise18 {
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

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || i == j || j==1 ||j==n ) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
