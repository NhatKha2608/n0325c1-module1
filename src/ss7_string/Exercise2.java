package ss7_string;

public class Exercise2 {
    public static void main(String[] args) {
        // a. Chuyển đổi String thành int
        String strInt = "123";
        int intValue = Integer.parseInt(strInt);
        System.out.println("String to int: " + intValue);

        // b. Chuyển đổi int thành String
        int num = 456;
        String strFromInt = String.valueOf(num);
        System.out.println("int to String: " + strFromInt);

        // c. Chuyển đổi String thành long
        String strLong = "789123";
        long longValue = Long.parseLong(strLong);
        System.out.println("String to long: " + longValue);

        // d. Chuyển đổi long thành String
        long longNum = 987654321L;
        String strFromLong = String.valueOf(longNum);
        System.out.println("long to String: " + strFromLong);

        // e. Chuyển đổi String thành float
        String strFloat = "12.34";
        float floatValue = Float.parseFloat(strFloat);
        System.out.println("String to float: " + floatValue);

        // f. Chuyển đổi float thành String
        float floatNum = 56.78f;
        String strFromFloat = String.valueOf(floatNum);
        System.out.println("float to String: " + strFromFloat);

        // g. Chuyển đổi String thành double
        String strDouble = "90.12";
        double doubleValue = Double.parseDouble(strDouble);
        System.out.println("String to double: " + doubleValue);

        // h. Chuyển đổi double thành String
        double doubleNum = 34.56789;
        String strFromDouble = String.valueOf(doubleNum);
        System.out.println("double to String: " + strFromDouble);

        // i. Chuyển đổi String thành short
        String strShort = "100";
        short shortValue = Short.parseShort(strShort);
        System.out.println("String to short: " + shortValue);

        // k. Chuyển đổi short thành String
        short shortNum = 200;
        String strFromShort = String.valueOf(shortNum);
        System.out.println("short to String: " + strFromShort);
    }
}

