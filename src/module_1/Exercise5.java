package module_1;

import java.util.Scanner;

public class Exercise5 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n;
        do {
            System.out.print("Nhập số lượng phần tử của mảng : ");
            n = scanner.nextInt();
            if (n < 2) {
                System.out.println("Nhâp sai vui lòng nhập lại số phần tử phải >=2  : ");
            }
        } while (n < 2);

        int[] arr = new int[n];
        inputArr(arr);

        if (!secondMax(arr)){
            System.out.println("Không có số lớn nhì ");
        }

    }

    public static void inputArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Nhập phần tử a[%d] : ", i);
            arr[i] = scanner.nextInt();
        }
    }

    public static boolean secondMax(int[] arr) {
        boolean c = true;
        int secondmax = 0;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (secondmax > max) {
                int temp = secondmax;
                secondmax =max;
                max = temp;
                c = true;
            } else if (arr[i] > secondmax && arr[i] < max) {
                secondmax = arr[i];
                c= true;
            }
        }
        if (c){
            System.out.println("so lon nhi " + secondmax);
            return true;

        }
        return false;
    }
}
