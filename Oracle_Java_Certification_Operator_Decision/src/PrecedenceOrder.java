public class PrecedenceOrder {
    public static void main(String[] args) {
        int a = 1;
        System.out.println(3+2*++a); // (3 + (2 * (++a) ) )

        int b, c, d=1;
        System.out.println(b=c=d);
        System.out.println("b: " +b);
        System.out.println("c: " +c);
        System.out.println("d: " +d);

    }
}
