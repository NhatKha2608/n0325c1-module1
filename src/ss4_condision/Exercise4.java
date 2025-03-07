package ss4_condision;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        // Nhập vào hai số nguyên a, b. In ra kết quả số lớn nhất , số nhỏ nhất
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số nguyên a: ");
        int a = scanner.nextInt();

        System.out.print("Nhập số nguyên b: ");
        int b = scanner.nextInt();

        int max, min;
        if (a > b) {
            max = a;
            min = b;
        } else {
            max = b;
            min = a;
        }
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);

    }
}
