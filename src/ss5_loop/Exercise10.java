package ss5_loop;

import java.util.Scanner;

/**
 * 10. Tính tổng S = 1 + 1/2 + 1/3 + ... + 1/n
 */

public class Exercise10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = scanner.nextInt();

        double s = 0.0;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / i;
        }
        System.out.println("S = " + s);
    }
}
