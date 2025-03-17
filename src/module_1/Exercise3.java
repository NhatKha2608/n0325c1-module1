package module_1;

import java.util.Scanner;

public class Exercise3 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Nhập vào chuỗi : ");
        String a = scanner.nextLine();
        if (countUpperCase(a) > 0) {
            System.out.printf("Có %d kí tự in hoa trong chuỗi. ", countUpperCase(a));
        } else {
            System.out.println("Không có chứa kí tự in hoa. ");
        }
    }

    public static int countUpperCase(String a) {
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                count++;
            }
        }
        return count;
    }
}
