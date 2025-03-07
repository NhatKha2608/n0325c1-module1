package ss5_loop;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        //11. Tính tổng S = 1 + 1/3! + 1/5! + ... + 1/(2n-1)!
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = scanner.nextInt();

        double s = 0.0;
        double fact = 1;
        for (int i = 1; i <= n; i++) {
            s += 1.0 / fact;
            fact *=(2*i)*(2*i+1);
        }
        System.out.println("S = " + s);
    }
}
