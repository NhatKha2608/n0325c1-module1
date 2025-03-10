package ss5_loop;

public class Main3 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // ung voi mot buoc lap cua cha => toan bo buoc lap cua con
            //i = 1 => 5 lan Hello
            //i = 2 => 5 lan Hello
            //i = 3 => 5 lan Hello
            //i = 4 => 5 lan Hello
            //i = 5 => 5 lan Hello
            for (int j = 1; j <= n; j++){
                System.out.println("Hello");
            }
        }

    }
}
