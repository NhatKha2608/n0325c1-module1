package ss5_loop;

public class Exercise16G {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=  (n-i)*2 + 1; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
