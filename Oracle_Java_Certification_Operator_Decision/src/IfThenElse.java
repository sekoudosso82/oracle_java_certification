public class IfThenElse {
    public static void main(String[] args) {
        int score = 65;

        if(score >= 0){
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // boolean
        System.out.println("Boolean *******************************");

        boolean x = false;

        if ( x = false){
            System.out.println("false");
        }else {
            System.out.println("true");  // true
        }

        if ( x == false){
            System.out.println("false"); // false
        }else {
            System.out.println("true");
        }

        System.out.println(" condition under condition *******************");
        int score1 = 4;
        String message;
        if ( score1 >= 4){
            message = "Good Job";
        }else if (score < 4) {
            message = "Decent job.";
        } else{
            message = "Bad";
        }
        System.out.println("message: " + message); // false

    }
}
