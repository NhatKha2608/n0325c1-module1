package ss4_condision;

import java.util.Scanner;

/**
 *  Nhập vào tháng năm và cho biết trong tháng đó có bao nhieu ngày
 */
public class Exercise8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tháng (1-12): ");
        int month = scanner.nextInt();
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
