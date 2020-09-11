import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForLoop {

    public static void main(String[] args) {

        for (int i = 0 ; i < 5; i++){
            System.out.println(" for loop Hello world!");
        }

        // Array with for loop

        List<Character> list = new ArrayList<>
                (Arrays.asList('A', 'B', 'C'));

        for (int i=0; i< list.size(); i++){
            System.out.println("for loop " + list.get(i));
        }

        // Array with for each
        for (Character x : list){
            System.out.println("for each " + x);
        }

        // this will throw error Array with for each
//        List<Character> forEachList = new ArrayList<>
//                (Arrays.asList('A', 'B', 'C'));
//        for (Character x : forEachList){
//            System.out.println("for each " + x);
//            forEachList.remove(x);
//
//        }
        // use for loop to alter array list insteate of FOR EACH
        List<Character> forLoopList = new ArrayList<>
                (Arrays.asList('A', 'B', 'C'));
        for (int i=0; i < forLoopList.size(); i++){
            System.out.println("for loop current to remove: " + forLoopList.get(i));
            forLoopList.remove(i);

        }




    }
}
