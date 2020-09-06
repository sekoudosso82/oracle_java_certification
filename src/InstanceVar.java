import java.security.PublicKey;

public class InstanceVar {

    public Integer a;

    public InstanceVar(){
        a=3;
        System.out.println("constructor: " + a);
    }

    {
        a=2;
        System.out.println("initializer: " + a);
    }

    public  static  void main(String[] args){
        System.out.println(new InstanceVar().a);

    }
}
