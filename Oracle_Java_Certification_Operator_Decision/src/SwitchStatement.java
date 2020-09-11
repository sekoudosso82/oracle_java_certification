public class SwitchStatement {

    public static void main(String[] args) {
        Character c = 'A';
        switch (c){

            case 'A' : System.out.println("Excellent job!");
                break;

            case 'B' : System.out.println("Good job!");
                break;

            default : System.out.println("Decent job");
        }

        System.out.println("calendar with switch statement");

        int days = 0 , month = 6;
        switch(month){
            case 1: case 3: case 5: case 6: case 7:
                days = 31;
                break;
            case 2:
                days = 28;
                break;

            default:
                days = 30;

        }
        System.out.println(days);

    }
}
