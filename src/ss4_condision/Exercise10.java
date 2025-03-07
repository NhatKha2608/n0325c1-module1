package ss4_condision;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String[] args) {
        //Kiểm tra 1 số nguyên dương x có phải là số chính phương hay không?
        // Định nghĩa số chính phương: Là số mà kết quả khai căn bậc 2 của nó là 1 số nguyên.
        // vd: 0, 1, 4, 9, 16, 25, 36 ...
        Scanner scanner =new Scanner(System.in);

        System.out.print("Nhập vào một số nguyên x : ");
        int x = scanner.nextInt();

        double squareRoot = Math.sqrt(x);
        if (squareRoot % 1==0){
            System.out.println("x là số chính phương");
        }else {
            System.out.println("x không phải là số chính phương");
        }
    }
}
