package CLG_PRACTICALS;

public class P_3 {

    public static void main(String[] args) {

        // Check if exactly two arguments are provided
        if (args.length != 2) {
            System.out.println("Please provide exactly two numbers as command-line arguments.");
            return;
        }

        // Convert command-line arguments from String to int
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        // Perform calculation
        int sum = num1 + num2;

        // Display result
        System.out.println("Sum = " + sum);
    }
}
