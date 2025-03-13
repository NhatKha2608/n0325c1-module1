package ss6_method;

import java.util.Scanner;

public class Exercise1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập kí tự : ");
        char c = scanner.nextLine().charAt(0);
        System.out.print("Kí tự sau khi đổi : " + toLowerCase(c) );
    }

    public static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z'){
            c += 32;
        }
        return c;
    }
}
