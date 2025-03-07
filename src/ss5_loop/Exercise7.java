package ss5_loop;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        //7. In dãy số Fibonacci đến n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = scanner.nextInt();

        int f1 = 0, f2 = 1,  fn = 1;
        System.out.print("Dãy Fibonacci : ");
        for (int i = 0; i < n; i++) {
            System.out.print( f1 + " ");
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }
    }
}
