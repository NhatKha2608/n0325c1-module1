package ss4_condision;

import java.io.DataOutput;
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        // Giai phương trình bật 1 có dạng : ax + b = 0
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm ");
            } else {
                System.out.println("Phương trình vô nghiệm ");
            }
        } else {
            double x = -b / a;
            System.out.println("Phương trình có nghiệm x = " + x);
        }
    }
}
