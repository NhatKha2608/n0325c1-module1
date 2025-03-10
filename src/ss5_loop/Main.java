package ss5_loop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int month;
        do {
            System.out.print("Nhập tháng (1-12): ");
            month = scanner.nextInt();
            if (month < 1 || month > 12) {
                System.out.println(" Nhap sai vui long nhap lai ");
            }
        } while (month < 1 || month > 12);
//            System.out.print("Nhập tháng (1-12): ");
//            int month = scanner.nextInt();
//            if (month < 1 || month > 12) {
//                System.out.println("Thang nhap bi sai!!");
//                return;
//            }
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();
        int day;
        switch (month) {
            case 4, 6, 9, 11 -> day = 30;
            case 2 -> {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                    day = 29;
                else
                    day = 28;
            }
            default -> day = 31;
        }
        System.out.printf("Tháng %d năm %d có %d ngày : ", month, year, day);
    }
}


