package ss6_method;

import java.util.Scanner;

public class Exercise1D {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a : ");
        int a = scanner.nextInt();
        System.out.print("Nhập b : ");
        int b = scanner.nextInt();
        System.out.print("Nhập c : ");
        int c = scanner.nextInt();
        System.out.print("Nhập d : ");
        int d = scanner.nextInt();

        System.out.println("Min = " +  min(a,b,c,d));

    }
    public static int min  (int a,int b, int c, int d){
        int min1 = a;
        if(b < min1){
            min1 =b;
        }else if(c < min1){
            min1 = c;
        }else if(d< min1){
            min1 = d;
        }
        return min1;
    }
}
