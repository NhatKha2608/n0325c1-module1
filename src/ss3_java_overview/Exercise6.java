package ss3_java_overview;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Nhập biển số xe : ");
        int bienSo = scanner.nextInt();
        int sum = bienSo%10;
        bienSo =bienSo/10;
        sum = sum + bienSo%10;
        
        bienSo =bienSo/10;
        sum = sum + bienSo%10;
       
        bienSo =bienSo/10;
        sum = sum + bienSo%10;
       
        bienSo =bienSo/10;
        sum =sum +bienSo;

        int nut = sum%10;
        System.out.println("Số nút của biển số xe : " + nut );
    }
}
