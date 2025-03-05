package ss3_java_overview;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so nguyen a: ");
        int a = scanner.nextInt();
        System.out.print("Nhap so nguyen b: ");
        int b =scanner.nextInt();
        System.out.println("Tong cua hai so nguyen a va b la: " +(a + b));
        System.out.println("Hieu cua hai so nguyen a va b la: " +(a - b));
        System.out.println("Tich cua hai so nguyen a va b la: " +(a * b));
        System.out.println("Thuong cua hai so nguyen a va b la: " + ((double)a / b));


    }
}
