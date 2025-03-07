package ss5_loop;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        //4. In dãy số chẵn từ 2 đến n với giá trị dương, âm xen kẽ mỗi 3 số
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n : ");
        int n = scanner.nextInt();

        for (int i = 2; i <= n; i += 2) {
            if (i % 6 == 0) {
                System.out.print(-i + "  ");
            } else {
                System.out.print(i + "  ");
            }
        }
    }
}
