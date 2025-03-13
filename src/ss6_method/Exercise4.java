package ss6_method;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a : ");
        int a = scanner.nextInt();
        System.out.print("Nhap b : ");
        int b = scanner.nextInt();
        System.out.printf("Ước chung lớn nhất của %d va %d là: %d",a,b,findUCLN(a,b));

    }

    public  static int findUCLN(int a, int b) {
        int ucln = 0;
        for (int i = a; i > 0; i--) {
            if (a % i == 0 && b % i == 0) {
                ucln = i;
                break;
            }
        }
        return ucln;
    }
}
