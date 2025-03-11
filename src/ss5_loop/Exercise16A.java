package ss5_loop;

<<<<<<< HEAD
=======

import java.util.Scanner;

>>>>>>> 6c66fb8 (hello)
public class Exercise16A {
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

        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
