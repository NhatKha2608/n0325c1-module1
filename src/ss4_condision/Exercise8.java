package ss4_condision;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        //nhập vào tháng năm và cho biết trong tháng đó có bao nhieu ngày
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tháng (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Nhập năm: ");
        int year = scanner.nextInt();

        int days;
        switch (month) {
            case 4, 6, 9, 11 -> days = 30;
            case 2 -> {
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
                    days = 29;
                else
                    days = 28;
            }
            default -> days = 31;
        }
        System.out.printf("Tháng %d năm %d có %d ngày : ", month, year, days);
    }
}
