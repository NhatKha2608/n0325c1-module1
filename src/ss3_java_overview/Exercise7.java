package ss3_java_overview;

public class Exercise7 {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int a = i++ + j++;
        System.out.println("Câu a : ");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);
        i = 1;
        j = 1;
        a = i++ + ++j;
        System.out.println("Câu b : ");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);
        i = 1;
        j = 1;
        a = ++i + j++;
        System.out.println("Câu c : ");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);
        i = 1;
        j = 1;
        a = ++i + ++j;
        System.out.println("Câu d : ");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);
        i = 1;
        j = 1;
        a = i++ + j++ + i++ + j++;
        System.out.println("Câu e : ");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);
        i = 1;
        j = 1;
        a = ++i + ++j + i++ + j++;
        System.out.println("Câu f : ");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("a = " + a);
        i = 1;
        a = i++ + ++i - i-- - --i;
        System.out.println("Câu g : ");
        System.out.println("i = " + i);
        System.out.println("a = " + a);
        a = 10;
        a += a++ + ++a;
        System.out.println("Câu h : ");
        System.out.println("a = " + a);
    }
}
