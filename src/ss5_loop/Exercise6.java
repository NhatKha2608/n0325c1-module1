package ss5_loop;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        //6.  In dãy số 2, -4, 6, 8, -10, 12, 14, 16, -18, ….., n
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = scanner.nextInt();
        int count = 0;
        int distance = 1;

        for (int i = 2; i <= n; i += 2) {
            if(distance == count){
                System.out.print(-i + " ");
                count =0;
                distance++;
            }else {
                System.out.print(i + " ");
                count++;
            }
        }
    }
}
