public class ReferenceScopeGlobalAndLocal {
    int a = 123; //global

    public static void main(String[] args) {
        ReferenceScopeGlobalAndLocal m = new ReferenceScopeGlobalAndLocal();
        m.print();
        m.print1(234);
        m.print();

    }

    public void print(){
        System.out.println(a);
    }

    public void print1(int a){
        System.out.println(a); //local
        a=345;
    }
}
