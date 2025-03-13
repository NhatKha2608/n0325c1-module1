package ss6_method;

import java.util.Scanner;

public class Exercise1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a : ");
        double a = scanner.nextDouble();

        System.out.print("Nhập b : ");
        double b = scanner.nextDouble();

        System.out.print("Nhập c : ");
        double c = scanner.nextDouble();

        equationTwo(a, b, c);
    }

    public static void equationOne(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm ");
            } else {
                System.out.println("Phương trình vô nghiem ");
            }
        } else {
            System.out.println("Phương trình có nghiệm là x = " + (-b / a));
        }
    }

    public static void equationTwo(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (a == 0) {
            equationOne(b, c);
        } else if (delta < 0) {
            System.out.println("Phương trình vô nghiem");
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm duy nhất x = " + (-b / (2 * a)));
        } else {
            double x1 = (-b - Math.sqrt(delta)) / (2 * a);
            double x2 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.printf("Phương trình có hai nghiệm x1 = %s , x2 = %s", x1, x2);
        }
    }
}
