package ss5_loop;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        //12. Tính tổng và tích các chữ số của một số nguyên
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap m : ");
        int m = scanner.nextInt();
        int s = 0;
        int p = 1;

        while (m > 0) {
            int digit = m % 10;
            s += digit;
            p *= digit;
            m = m / 10;
        }
        System.out.println("Tổng = " + s);
        System.out.println("Tích = " + p);
    }
}
