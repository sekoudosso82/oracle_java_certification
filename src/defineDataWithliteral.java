import java.math.BigDecimal;

public class defineDataWithliteral {

    public static void main(String[] args) {
//        int a = 0x2A;
//        System.out.println(a); // 42
//        System.out.println(Integer.toBinaryString(a));  // 101010
//        System.out.println(Integer.toBinaryString(42));  //101010

        // octor example

//        int b = 052; // the leading 0 treat 052 as octor value
//        System.out.println(b); // 42

        // floating point num

//        float e = 1.23451234512345; // incompatible types: lossy conversion from double to float
//        System.out.println(e);

        // but we can force java to consider double number as float
//        float e = 1.23451234512345f; // 1.2345123 still losing some part
//        System.out.println(e);

        // but we can use double number
//        double e = 1.23451234512345; // 1.23451234512345 exact value
//        System.out.println(e);

        // other DOUBLE example
//        double e = 0.02;
//        System.out.println(e); // 0.02
//        System.out.println(new BigDecimal(e)); // 0.0200000000000000004163336342344337026588618755340576171875

        // DOUBLE with more precise value can produce same BigDecimal value if sum is power of 2
        double e = 1.666656494140625;
        System.out.println(e); // 1.666656494140625
        System.out.println(new BigDecimal(e)); // 1.666656494140625

        // more wy to represent char

        char a = 'a';
        char b = 97 ;
        char c = 0x03C0;
        char d = '\u03C0';
        System.out.println(a);// a
        System.out.println(b);// a
        System.out.println(c);// π
        System.out.println(d);// π
        System.out.println(a+b+c+d);// 2114 java will interpret a as inter because it in an arithmetic flow

    }
}

