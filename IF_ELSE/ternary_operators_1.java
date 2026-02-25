package if_else;

public class ternary_operators_1 {
    public static void main(String[] args) {

        int num = 3;
        String evenORodd = (num % 2 == 0) ? "even" : "odd" ;
        System.out.println("Number is : " + evenORodd);

        int hours = 9;
        String timeOFday = (hours < 12) ? "A.M." : "P.M.";
        System.out.println( "Time of day is in : "+ timeOFday);

        int income = 60000;
        double taxrate = (income >= 40000) ? 0.25 : 0.15 ;
        System.out.println("Tax rate is : " + taxrate);
    }
}
