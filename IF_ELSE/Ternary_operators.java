package if_else;

public class Ternary_operators {
    public static void main(String[] args) {

        // ternary operator ? = return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;

        int score = 60;
        /*
        if (score >= 60){
            System.out.println("PASS");

        }
        else {
            System.out.println("FAIL");
        }
         */

        String PassOrFail = (score >= 60 ) ? "PASS" : "FAIL" ;
        System.out.println(PassOrFail);

    }
}
