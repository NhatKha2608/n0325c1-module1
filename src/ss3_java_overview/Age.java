package ss3_java_overview;

import java.time.Year;
import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        System.out.print("Nhap nam sinh cua ban: ");
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int age = Year.now().getValue() - year;

        System.out.print("Tuoi cua ban hien tai la: "+ age);

    }
}
