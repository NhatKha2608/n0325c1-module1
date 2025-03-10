package ss5_loop;

public class Exercise16E {
    public static void main(String[] args) {
        int n = 5;
        int j;
        for (int i = 1; i <= n; i++) {
            for (j = 1; j <= n - i + 1; j++) {
                if (i == 1 || j == 1 || j == n - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
