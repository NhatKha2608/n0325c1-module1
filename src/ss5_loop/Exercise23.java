package ss5_loop;

public class Exercise23 {
    public static void main(String[] args) {
        System.out.println("Số thõa mãn điều kiện là : ");

        for (int n = 10; n <= 99; n++) {

            int unitsDigit = n % 10;
            int tensDigit = n / 10;

            int sum = unitsDigit + tensDigit;
            int accumulation = unitsDigit * tensDigit;

            if (sum * 2 == accumulation) {
                System.out.print(n + " ");
            }
        }
    }
}
