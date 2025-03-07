package ss5_loop;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        //13. Tìm ước số chung lớn nhất và bội số chung nhỏ nhất của 2 số nguyên dương
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a : ");
        int a = scanner.nextInt();
        System.out.print("Nhap b : ");
        int b = scanner.nextInt();

        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                System.out.println("UCLN : " + i);
                break;
            }
        }
        for (int i = a; true; i++) {
            if (i % a == 0 && i % b == 0) {
                System.out.println("BCNN : " + i);
                break;
            }
        }
    }
}
