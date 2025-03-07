package ss4_condision;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        //Nhập vào 2 số nguyên, lưu vào 2 biến a và b.
        // Sau đó, đảo giá trị của 2 biến này rôi xuất giá trị của chúng ra màn hình console.
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        int c = a;
        a = b;
        b = c;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
