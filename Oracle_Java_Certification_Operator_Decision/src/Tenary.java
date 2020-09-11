public class Tenary {
    public static void main(String[] args) {

        int score = 2;
        String comment = score>=4 ?  "excellent job!" :
                score>=3 ? "Good job!": "Good try!";

        System.out.println(comment);
    }
}
