package ss3_java_overview;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm : ");
        String tenSP = scanner.nextLine();

        System.out.print("Nhập số lượng san phẩm : ");
        int soLuong =scanner.nextInt();

        System.out.print("Nhập đơn giá : ");
        double donGia =scanner.nextDouble();
        double tien = soLuong*donGia;
        double thueVAT = tien*0.1;

        System.out.println("Tên sản phẩm :" + tenSP);
        System.out.println("Số tiền : " + tien);
        System.out.println("Thuế VAT : " + thueVAT);
    }
}
