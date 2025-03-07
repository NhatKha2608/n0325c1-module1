package ss4_condision;

import java.util.Scanner;

public class Exercise2a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Nhap mot so tu nhien tu 1 den 10 : ");
        int a = scanner.nextInt();

        if (a == 1) {
            System.out.println("One");
        } else if (a == 2) {
            System.out.println("Two");
        } else if (a == 3) {
            System.out.println("Three");
        } else if (a == 4) {
            System.out.println("Four");
        } else if (a == 5) {
            System.out.println("Five");
        } else if (a == 6) {
            System.out.println("Six");
        } else if (a == 7) {
            System.out.println("Seven");
        } else if (a == 8) {
            System.out.println("Eight");
        } else if (a == 9) {
            System.out.println("Nine");
        } else if (a == 10) {
            System.out.println("Ten");
        } else System.out.println(" Nhap sai !!!");
    }
}
