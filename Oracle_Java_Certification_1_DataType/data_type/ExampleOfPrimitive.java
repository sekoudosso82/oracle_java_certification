public class ExampleOfPrimitive {
    public static void main(String[] args){

        // this won't run because int take less byte
        // int a = 123451234512345;
        // System.out.println(a);
        // // this won't run because long take less byte
        // long a = 123451234512345;
        // System.out.println(a);

        // // this will run because L at the end of var a
        // long a = 123451234512345L;
        // System.out.println(a);

        // // this will run 
        // short a = 42;
        // System.out.println(a);

        // this won't run because int take less byte
            

        // double sum = 0 ;
        // for ( int i = 0 ; i < 50 ; i++){
        //     sum += 0.02;
        // }

        // System.out.println(sum);

        Integer b= 123;
        System.out.println(b);
        Object a = b;
        System.out.println(a);

        b = null;
        System.out.println(b);
        
        System.out.println(a);



    }


}

