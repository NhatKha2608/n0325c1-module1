package ss7_string;

public class Main2 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30};
        changeData(a);

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    static void changeData(int arr[]) {
        arr[1] = 99;
        arr[2] = 123;
        arr = new int[]{1, 2, 3};//tạo ra giá trị và địa chỉ mới
        arr[1] = 100;
    }
}
