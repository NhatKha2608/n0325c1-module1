package ss7_string;

import java.util.Scanner;

// giá trị khi ra khỏi hàm là ko thay đổi . miền giá trij thay đổi
public class Main1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Bước 1 Nhập vào số lượng phân tử của mảng
        int n;
        do {
            System.out.print("Nhập sl phan tử >=0: ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Nhập sai vui long nhap lai voi n>=0 ");
            }
        } while (n < 0);


        // Bước 2 : Tạo ra mảng có n phần tử
        int[] arr = new int[n];

        inputArr(arr);
        outputArr(arr);

        // Bước 3: Nhập mảng
//        for (int i = 0; i < n; i++) {
//            System.out.printf("Nhập vào phần tử arr[%d]: ", i);
//            arr[i] = scanner.nextInt();
//        }

        // Bước 4 : Xuất mảng
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i] + " " );
//        }

    }

    static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào phần tử arr[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
    }

    static void outputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
