package ss5_loop;

import java.util.Scanner;

/**
 *   9. In dãy số 1, -3, 7, -15, 31, ... n
 */
public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i = 2 * i + 1) {
            if (i%3==0){
                System.out.print(-i + " ");
            }else {
                System.out.print(i + " ");
            }
        }
    }
}
