package ss4_condision;

import java.util.Scanner;

/**
 * 11. Kiểm tra và tìm ngày kế tiếp, ngày trước đó
 */
public class Exercise11 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ngày : ");
        int day = scanner.nextInt();

        System.out.print("Nhập tháng : ");
        int month = scanner.nextInt();

        System.out.print("Nhập năm : ");
        int year = scanner.nextInt();

        // kiểm tra ngày, tháng có hợp lệ hay không
        if (day < 1 || day > 31) {
            System.out.println("Ngày không hợp lệ!!");
            return;
        }


        if (month < 1 || month > 12) {
            System.out.println("Tháng không hợp lệ!! ");
            return;
        }

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 31) {
                System.out.println("Ngày không hợp lệ!!");
                return;
            }
        }

        boolean isLeapYear = year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
        if (month == 2) {
            if (isLeapYear) {
                if (day > 29) {
                    System.out.println("Ngày không hợp lệ!!");
                    return;
                }

            } else if (day > 28) {
                System.out.println("Ngày không hợp lệ!!");
                return;
            }
        }

        //Ngày tiếp theo
        int nextDay = day;
        int nextMonth = month;
        int nextYear = year;

        nextDay++;

        if (nextDay > 31
                || (month == 2 && nextDay > (isLeapYear ? 29 : 28))
                || (month == 4 || month == 6 || month == 9 || month == 11) && nextDay > 30) {
            nextDay = 1;
            nextMonth++;
        }

        if (nextMonth > 12) {
            nextMonth = 1;
            nextYear++;
        }
        System.out.println("Ngày tiếp theo : " + nextDay + "/" + nextMonth + "/" + nextYear);

        //Ngày trước đó
        int previousDay = day;
        int previousMonth = month;
        int previousYear = year;

        previousDay--;

        if (previousDay == 0) {
            if (previousMonth == 3) {
                previousDay = (isLeapYear ? 29 : 28);
                previousMonth--;
            } else if (previousMonth == 5 || previousMonth == 7 || previousMonth == 10 || previousMonth == 12) {
                previousDay = 30;
                previousMonth--;
            } else if (previousMonth == 1) {
                previousDay = 31;
                previousMonth = 12;
                previousYear--;
            } else {
                previousDay = 31;
                previousMonth--;
            }
        }

        System.out.println("Ngày trước đó : " + previousDay + "/" + previousMonth + "/" + previousYear);

    }
}
