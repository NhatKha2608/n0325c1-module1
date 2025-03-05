package ss3_java_overview;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập điểm toán : ");
        double toan = scanner.nextDouble();
        System.out.print("Nhập hệ số toán : ");
        double hsToan = scanner.nextDouble();
        System.out.print("Nhập điểm lý : ");
        double ly = scanner.nextDouble();
        System.out.print("Nhập hệ số lý : ");
        double hsLy = scanner.nextDouble();
        System.out.print("Nhập điểm hóa : ");
        double hoa = scanner.nextDouble();
        System.out.print("Nhập hệ số hóa : ");
        double hsHoa = scanner.nextDouble();

        double diemTB = ((toan * hsToan + ly * hsLy + hoa * hsHoa) / (hsToan + hsLy + hsHoa));
        System.out.println("Điểm trung bình : " + diemTB);
    }
}
