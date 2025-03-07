package ss5_loop;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        //8. In dãy số 1, 3, 7, 15, 31, ... n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i = 2 * i + 1) {
            System.out.print(i + " ");
        }

    }
}
