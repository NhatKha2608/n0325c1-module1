package ss5_loop;

import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = scanner.nextInt();
        //cach1
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) System.out.print(i + "  ");
        }
        //cach 2
//        for (int i = 1; i <= n; i+=2){
//            System.out.println( i + "   ");
//        }
    }
}
