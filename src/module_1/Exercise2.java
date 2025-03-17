package module_1;

import java.util.Scanner;

public class Exercise2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập số lượng phần tử của mảng : ");
            n = scanner.nextInt();
            if (n <= 0 || n >= 20) {
                System.out.println("Nhâp sai vui lòng nhập lại n>0, n<20");
            }
        } while (n <= 0 || n >= 20);

        int[] arr = new int[n];
        inputArr(arr);

        int result = 0;

//        for (int i = 0; i < n; i++) {
//            if (arr[i] % 2 == 0) {
//                result += arr[i];
//            } else {
//                result -= arr[i];
//            }
//        }
//        for (int item : arr) {
//            if (item % 2 == 0) {
//                result += item;
//            } else {
//                result -= item;
//            }
//        }
        for (int item : arr) {
            result += item % 2 == 0 ? item : -item;
        }
        System.out.println("Kết quả : " + result);
    }

    public static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử a[%d] : ", i);
            arr[i] = scanner.nextInt();
        }
    }

}
