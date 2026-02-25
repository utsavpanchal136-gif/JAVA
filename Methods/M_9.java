package Methods;

public class M_9 {

    // Method to calculate sum of two numbers
    public static int sum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {

        int number1 = Integer.valueOf(args[0]); // do NOT change this line
        int number2 = Integer.valueOf(args[1]); // do NOT change this line

        int result;

        // Call the sum method
        result = sum(number1, number2);

        System.out.println("The sum is : " + result);
    }
}
