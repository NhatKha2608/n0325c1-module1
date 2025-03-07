package ss5_loop;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        //5. In dãy số chẵn từ 2 đến 2n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = scanner.nextInt();

        for (int i = 2; i <= 2*n; i+=2) {
            if (i % 2 == 0) {
                System.out.print(i + "  ");
            }
        }
    }
}
