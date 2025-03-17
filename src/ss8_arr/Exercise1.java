package ss8_arr;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập mảng
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // a. Vị trí cuối cùng của phần tử x trong mảng
        System.out.print("Nhập giá trị x: ");
        int x = scanner.nextInt();
        findLastIndex(arr, x);

        // b. Vị trí số nguyên tố đầu tiên trong mảng
        findFirstPrimeIndex(arr);

        // c. Tìm số dương nhỏ nhất trong mảng
        findMinPositive(arr);

        // d. Tìm các vị trí của k trong mảng
        System.out.print("Nhập phần tử k cần tìm: ");
        int k = scanner.nextInt();
        findAllIndexes(arr, k);

        // e. Tìm giá trị lớn nhất và nhỏ nhất trong mảng
        findMinMax(arr);

    }

    // a. Tìm vị trí cuối cùng của phần tử x trong mảng
    public static void findLastIndex(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        if (lastIndex != -1) {
            System.out.println("Vị trí cuối của " + x + " là: " + lastIndex);
        } else {
            System.out.println(x + " không có trong mảng.");
        }
    }

    // b. Tìm vị trí số nguyên tố đầu tiên trong mảng
    public static void findFirstPrimeIndex(int[] arr) {
        int primeIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                primeIndex = i;
                break;
            }
        }
        if (primeIndex != -1) {
            System.out.println("Vị trí số nguyên tố đầu tiên: " + primeIndex);
        } else {
            System.out.println("Không có số nguyên tố trong mảng.");
        }
    }

    // c. Tìm số dương nhỏ nhất trong mảng
    public static void findMinPositive(int[] arr) {
        int minPositive = Integer.MAX_VALUE;
        boolean foundPositive = false;
        for (int num : arr) {
            if (num > 0) {
                if (!foundPositive || num < minPositive) {
                    minPositive = num;
                    foundPositive = true;
                }
            }
        }
        if (foundPositive) {
            System.out.println("Số dương nhỏ nhất: " + minPositive);
        } else {
            System.out.println("Không có số dương trong mảng.");
        }
    }

    // d. Tìm các vị trí của k trong mảng
    public static void findAllIndexes(int[] arr, int k) {
        boolean found = false;
        System.out.print("Các vị trí của " + k + " trong mảng: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không có " + k + " trong mảng.");
        } else {
            System.out.println();
        }
    }

    // e. Tìm giá trị lớn nhất và nhỏ nhất trong mảng
    public static void findMinMax(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Giá trị lớn nhất: " + max);
        System.out.println("Giá trị nhỏ nhất: " + min);
    }

    // Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
