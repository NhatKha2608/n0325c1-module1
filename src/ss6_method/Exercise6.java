package ss6_method;

import java.util.Scanner;

public class Exercise6 {
    static String Name;
    static int age;
    static String gender;
    static double salary;
    static double gpa;

    public static void main(String[] args) {

        enterInformation();
        showInformation();
    }

    // Nhập thông tin
    public static void enterInformation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin nhân viên");

        System.out.print("Nhập họ và tên : ");
        Name = scanner.nextLine();

        System.out.print("Nhập tuổi : ");
        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nhập giới tính : ");
        gender = scanner.nextLine();

        System.out.print("Nhập mức lương : ");
        salary = scanner.nextDouble();

        System.out.print("Nhập điểm trung bình tốt nghiệp đại học : ");
        gpa = scanner.nextDouble();
    }

    // Xuất thông tin
    public static void showInformation() {
        System.out.println("\nThông tin nhân viên:");
        System.out.println("Họ tên: " + Name);
        System.out.println("Tuổi: " + age);
        System.out.println("Giới tính: " + gender);
        System.out.println("Mức lương: " + salary);
        System.out.println("Điểm trung bình: " + gpa);
    }
}
