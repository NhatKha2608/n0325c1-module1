package ss6_method;

public class Main2 {
    public static void main(String[] args) {
        int a = 2, b = 3;
        int total = calTotal(a,b);
        calTotal1(a,b);
        System.out.println("Total : " + total);
    }
    //cach 1
    public static void calTotal1(int a, int b){
        int total = a + b;
        System.out.println("Total : " + total);
    }
    //cach 2
    public static int calTotal(int a, int b){
        int total = a + b;
        return total;
    }
}
