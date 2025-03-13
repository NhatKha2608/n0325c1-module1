package ss6_method;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = scanner.nextInt();

        System.out.printf("Có %d phần tử của dãy Fibonacci là: ",n);
        fibonacci(n);

    }
    public static void fibonacci(int n){
        int f1 = 0, f2 = 1,  fn = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print( f1 + " ");
            f1 = f2;
            f2 = fn;
            fn = f1 + f2;
        }
    }
}
