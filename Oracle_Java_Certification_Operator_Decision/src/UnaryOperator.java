public class UnaryOperator {

    public static void main(String[] args){
        int a = 42 ;
        System.out.println(a);
        System.out.println(++a); //add 1 to a and print new value
        System.out.println(a); // just print

        System.out.println(a++); // add 1 to a but print previous value of a
        System.out.println(a); // just print

        System.out.println(--a);// subtract one 1 to a and print new value
        System.out.println(a);  // just print

        // binary Operators
        System.out.println("binary Operators");

        System.out.println(1 << 1); // 2
        System.out.println(-1 << 1); // -2

        System.out.println(4 >> 1); // 2
        System.out.println(-4 >> 1); // 2

        System.out.println(1 >> 1); // 0

        System.out.println(-4 >>> 1); // 2147483646

        // modulo operator  keeps the sign of the numerator

        System.out.println("Modulo operator keeps the sign of the numerator");
        System.out.println(5%3); // 2
        System.out.println(-5%-3); // -2
        System.out.println(-5%3); // -2
        System.out.println(5%-3); // 2

        // boolean operator
        System.out.println(" boolean operator");
        System.out.println(true & true);  // true
        System.out.println(true & false); // false
        System.out.println(false & true); // false
        System.out.println( true | true); // true
        System.out.println( true | false); // true
        System.out.println( false | false); // false

        System.out.println( "short operator");
        System.out.println(true && true); // true
        System.out.println(false && 1/0==1); // false
        System.out.println( true || false || 1/0==0); // true






    }
}
