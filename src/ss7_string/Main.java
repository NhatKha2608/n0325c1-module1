package ss7_string;

public class Main {
    public static void main(String[] args) {
        String name = "Nguyen Van A";
        String name1= "Nguyen Van A";
        String name2 = new String("Nguyen Van A");

        System.out.println(name == name1);
        System.out.println(name.equals(name2));
        System.out.println(name.substring(6));

    }
}
