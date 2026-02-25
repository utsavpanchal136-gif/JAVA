package Bro_code_videos;

import java.util.Scanner;

public class compound_interest_calculator {

    public static void main(String[] args) {

        // compound interest calculator

        Scanner scanner = new Scanner(System.in);

        double principal , rate , amount ;
        int timecompounded , years;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %) : ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times compounded per year : ");
        timecompounded = scanner.nextInt();

        System.out.print("Enter the # of years : ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timecompounded , timecompounded * years );
        System.out.printf("The amount after %d years is %.2f" , years , amount);
        scanner.close();
    }
}
