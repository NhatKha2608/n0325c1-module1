package ss4_condision;

import java.util.Scanner;

/**
 *   Tính lương nhân viên theo thâm niên công tác
 *   final double BASIC_SALARY = 650000;
 */
public class Exercise7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào thâm niên công tác của nhân viên : ");
        int workingSeniority = scanner.nextInt();
        final double BASIC_SALARY = 650000;
        double salaryCoefficient;

        if (workingSeniority < 12) {
            salaryCoefficient = 1.92;
        } else if (workingSeniority < 36) {
            salaryCoefficient = 2.34;
        } else if (workingSeniority < 60) {
            salaryCoefficient = 3;
        } else {
            salaryCoefficient = 4.5;
        }

        double salary = BASIC_SALARY *salaryCoefficient;
        System.out.println("Lương của nhân viên là : " + salary);
    }
}
