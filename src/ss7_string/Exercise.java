package ss7_string;

import java.util.Scanner;

public class Exercise {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập sl phan tử >=0: ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Nhập sai vui long nhap lai voi n>=0 ");
            }
        } while (n < 0);

        int[] a = new int[n];
        inputArr(a);
        if (isAllEven(a)){
            System.out.println("Mảng toàn chẵn");
        } else {
            System.out.println("Mảng không toàn chẵn");
        }
        System.out.println("Tổng các số lẻ >0 : " + sumOdd(a));

    }

    static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập vào phần tử arr[%d]: ", i);
            arr[i] = scanner.nextInt();
        }
    }
    static boolean isAllEven(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
               return false;
            }
        }
        return true;
    }

    // tổng các số lẻ >0
    static int sumOdd(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] > 0 && arr[i] % 2 !=0){
                sum += arr[i];
            }
        }
        return sum;
    }
}
