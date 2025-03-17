package ss7_string;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        String str = "Hello World";

        // a. Lấy ra chữ "World"
        String world = str.substring(6);
        System.out.println("a. " + world);

        // b. Thay 'o' thành 'f'
        String replaced = str.replace('o', 'f');
        System.out.println("b. " + replaced);

        // c. Đếm số lần xuất hiện của 'l'
        long countL = str.chars().filter(ch -> ch == 'l').count();
        System.out.println("c. " + countL);

        // d. Vị trí xuất hiện đầu tiên và cuối cùng của 'l'
        int firstIndex = str.indexOf('l');
        int lastIndex = str.lastIndexOf('l');
        System.out.println("d. Đầu: " + firstIndex + ", Cuối: " + lastIndex);

        // e. Xóa hết khoảng trắng ở đầu, giữa và cuối
        String removeSpaces = str.replace(" ", "");
        System.out.println("e. " + removeSpaces);

        // f. Xóa khoảng trắng đầu và cuối
        String trimSpaces = str.trim();
        System.out.println("f. " + trimSpaces);

        // g. Đảo ngược chuỗi
        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("g. " + reversed);

        // h. Tạo thành chuỗi "SQC Hello World"
        String sqcStr = "SQC " + str;
        System.out.println("h. " + sqcStr);

        // i. Chuyển S thành chữ hoa
        String upperCase = str.toUpperCase();
        System.out.println("i. " + upperCase);

        // k. Chuyển S thành chữ thường
        String lowerCase = str.toLowerCase();
        System.out.println("k. " + lowerCase);

        // l. Trích xuất chuỗi con từ vị trí n đến m
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n: ");
        int n = scanner.nextInt();
        System.out.print("Nhập m: ");
        int m = scanner.nextInt();

        if (n >= 0 && m <= str.length() && n < m) {
            String substring = str.substring(n, m);
            System.out.println("l. " + substring);
        } else {
            System.out.println("Lỗi: Giá trị n và m không hợp lệ.");
        }

        scanner.close();
    }
}

