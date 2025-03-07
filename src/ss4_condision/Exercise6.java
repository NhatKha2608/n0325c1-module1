package ss4_condision;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        // Giai phương trình bật 2 có dạng : ax2 + bx + c =0
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phương trình có vô số nghiệm ");
                } else {
                    System.out.println("Phương trình vô nghiệm ");
                }
            } else {
                double x = -b / c;
                System.out.println("Phương trình có nghiệm x = " + x);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Phương trình có nghiệm x = " + x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("Phương trình có hai nghiệm là x1 = " + x1 + " x2 = " + x2);
            }
        }
    }
}
