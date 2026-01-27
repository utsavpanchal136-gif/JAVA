import java.util.Scanner;


public class P_2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a five-digit number: ");
        int number = sc.nextInt();

        // Check for 5-digit number
        if (number < 10000 || number > 99999) {
            System.out.println("Invalid input! Please enter only a five-digit number.");
        } else {

            int d1, d2, d3, d4, d5;
            int newNumber;

            // Extract digits
            d5 = number % 10;
            number = number / 10;

            d4 = number % 10;
            number = number / 10;

            d3 = number % 10;
            number = number / 10;

            d2 = number % 10;
            number = number / 10;

            d1 = number % 10;

            // Add 1 to each digit (9 becomes 0)
            d1 = (d1 + 1) % 10;
            d2 = (d2 + 1) % 10;
            d3 = (d3 + 1) % 10;
            d4 = (d4 + 1) % 10;
            d5 = (d5 + 1) % 10;

            // Create new number
            newNumber = d1 * 10000 + d2 * 1000 + d3 * 100 + d4 * 10 + d5;

            System.out.println("New number: " + newNumber);
        }


    }
}

