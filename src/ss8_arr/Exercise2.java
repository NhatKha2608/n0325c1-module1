package ss8_arr;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Nhập số lượng nhân viên: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Khởi tạo các mảng để lưu thông tin nhân viên
        String[] names = new String[n];
        int[] ages = new int[n];
        String[] genders = new String[n];
        double[] salaries = new double[n];
        double[] gpa = new double[n];

        // Nhập thông tin nhân viên
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin cho nhân viên " + (i + 1) + ":");
            System.out.print("Họ và tên: ");
            names[i] = scanner.nextLine();
            System.out.print("Tuổi: ");
            ages[i] = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Giới tính (Nam/Nữ): ");
            genders[i] = scanner.nextLine();
            System.out.print("Lương cơ bản: ");
            salaries[i] = scanner.nextDouble();
            System.out.print("Điểm trung bình tốt nghiệp đại học: ");
            gpa[i] = scanner.nextDouble();
            scanner.nextLine();
        }

        // Xuất thông tin nhân viên
        System.out.println("\nDanh sách nhân viên:");
        for (int i = 0; i < n; i++) {
            System.out.println("Nhân viên " + (i + 1) + ":");
            System.out.println("Họ và tên: " + names[i]);
            System.out.println("Tuổi: " + ages[i]);
            System.out.println("Giới tính: " + genders[i]);
            System.out.println("Lương cơ bản: " + salaries[i]);
            System.out.println("Điểm trung bình tốt nghiệp đại học: " + gpa[i]);
        }

    }
}
