package ss5_loop;

import java.util.Scanner;

public class Exercise19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần chuyển đổi : ");
        int n = scanner.nextInt();

        String binary = "";
        while (n > 0) {
            int a = n % 2;
            binary = a +binary;
            n = n / 2;
        }
        System.out.println("Số nhị phân là : " + binary);
    }
}
