public class ObjectReference {


    public  static  void main(String[] args){

        ObjectReference a = new ObjectReference();
        ObjectReference b = a;

        System.out.println("a: " + a);
        a = null;

        System.out.println("b: " + b);
        b = null;

        System.gc();
        System.out.println(" end of main()");
    }

    public void finalize(){
        System.out.println("bye from: "+ this);
    }

}
