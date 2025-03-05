package ss3_java_overview;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính : ");
        double r = scanner.nextDouble();
        double c = 2 * Math.PI * r;
        double a = Math.PI * Math.pow(r, 2);
        System.out.println("Chu vi la : " + c);
        System.out.println("Diện tích là : " + a);
    }
}
