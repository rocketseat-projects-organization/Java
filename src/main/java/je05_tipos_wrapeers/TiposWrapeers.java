package je05_tipos_wrapeers;

public class TiposWrapeers {
    public static void main(String[] args) {
        // Explicit conversion
        double numeroDouble = 123.56;
        int numeroInt = (int) numeroDouble;
        System.out.println(numeroInt); // 123

        // Implicit conversion
//        double d = 101.56;
//        int i = d;
//        System.out.println(i); // 100

        // Wrapper conversion
        double d1 = 110.5656;
        Integer i1 = (int) d1;
        System.out.println(i1); // 110

        // Tentar converter um double de valor 3.75 para um int ?
        double d2 = 3.75;
        int i2 = (int) d2;
        System.out.println(i2); // 3

        String num = "101";
        int i3 = Integer.parseInt(num);
        System.out.println(i3); // 101

        String num1 = "120,123";
        double i4 = Double.parseDouble(num);
        System.out.println(i4); // 120

        Integer obj = Integer.valueOf("109");
        int i5 = obj.intValue();
        System.out.println(i5);

        // Compare two objects
        Integer obj1 = new Integer(101);
        Integer obj2 = new Integer(100);
        System.out.println(obj1.equals(obj2)); // true
        System.out.println(obj1.compareTo(obj2)); // 1

        System.out.println(obj1 > obj2); // true

    }
}
