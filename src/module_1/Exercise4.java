package module_1;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập số lượng phần tử của mảng : ");
            n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Nhâp sai vui lòng nhập lại n>0");
            }
        } while (n < 0);

        int[] arr = new int[n];

        inputArr(arr);
        Arrays.sort(arr);

//        for (int i = 0; i < n; i++) {
//            if (isPrime(arr[i])) {
//                System.out.println(arr[i] + " ");
//            }
//        }
        getIprime(arr);

    }

    public static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử a[%d] : ", i);
            arr[i] = scanner.nextInt();
        }
    }

    static int[] getIprime(int[] arr){

        // buoc 1 :  dem so luong
        int countPrime = 0;

        // tao mang voi
        for (int item : arr) {
            if(isPrime(item)){
                countPrime ++;
            }
        }
        int[] primeArr = new int[countPrime];
        int indexPrimeArr =0;
        for (int item : arr){
            if ((isPrime(item))){
                primeArr[indexPrimeArr++] = item;
            }
        }
        return primeArr;

    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
