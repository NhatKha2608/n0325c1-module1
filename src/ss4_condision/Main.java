package ss4_condision;

import java.util.Scanner;

public class Main {
    // Phương thức nhập thông tin nhân viên tại vị trí index
    public static void nhapThongTin(Scanner scanner, String[] hoTen, String[] gioiTinh, int[] tuoi, double[] luong, int index) {
        System.out.println("\nNhập thông tin cho nhân viên thứ " + (index + 1) + ": ");
        System.out.print("Họ tên: ");
        hoTen[index] = scanner.nextLine();
        System.out.print("Giới tính: ");
        gioiTinh[index] = scanner.nextLine();
        System.out.print("Tuổi: ");
        tuoi[index] = scanner.nextInt();
        System.out.print("Lương: ");
        luong[index] = scanner.nextDouble();
        scanner.nextLine(); // Xử lý ký tự xuống dòng
    }

    // Phương thức xuất thông tin nhân viên tại vị trí index
    public static void xuatThongTin(String[] hoTen, String[] gioiTinh, int[] tuoi, double[] luong, int index) {
        System.out.printf("%-20s %-10s %-5d %-10.2f\n", hoTen[index], gioiTinh[index], tuoi[index], luong[index]);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng nhân viên
        System.out.print("Nhập số lượng nhân viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Xử lý ký tự xuống dòng

        // Khai báo mảng lưu thông tin nhân viên
        String[] hoTen = new String[n];
        String[] gioiTinh = new String[n];
        int[] tuoi = new int[n];
        double[] luong = new double[n];

        // Nhập thông tin nhân viên
        for (int i = 0; i < n; i++) {
            nhapThongTin(scanner, hoTen, gioiTinh, tuoi, luong, i);
        }

        // Hiển thị danh sách nhân viên
        System.out.println("\nDanh sách nhân viên:");
        System.out.printf("%-20s %-10s %-5s %-10s\n", "Họ tên", "Giới tính", "Tuổi", "Lương");
        for (int i = 0; i < n; i++) {
            xuatThongTin(hoTen, gioiTinh, tuoi, luong, i);
        }

        scanner.close();
    }
}
