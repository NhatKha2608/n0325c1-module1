package ss3_java_overview;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {

        // System.in :tieu chuan de nhap du lieu tu ban phim
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap tuoi cua ban: ");
        //int age = scanner.nextInt();
        int age = Integer.parseInt(scanner.nextLine());

        System.out.print("Nhap ten cua ban: ");
        String name =scanner.nextLine();

        System.out.println("Ten cua ban la: " + name );
        System.out.print("Tuoi cua ban la: " + age);

    }
}
