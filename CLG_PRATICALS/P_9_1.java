package CLG_PRACTICALS;

import java.util.Scanner;

public class P_9_1 {

    public static boolean isValidPassword(String password) {

        if (password.length() < 8) {
            return false;
        }

        int digitCount = 0;

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isDigit(ch)) {
                digitCount++;
            }
            else if (!Character.isLetter(ch)) {
                return false;
            }
        }

        return digitCount >= 2;
    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("---- Password Rules ----");
        System.out.println("1. Minimum 8 characters");
        System.out.println("2. Only letters and digits allowed");
        System.out.println("3. At least 2 digits required\n");

        while (true) {

            System.out.print("Enter password: ");
            String password = sc.nextLine();

            if (isValidPassword(password)) {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }

            System.out.print("Do you want to try again? (yes/no): ");
            String choice = sc.nextLine();

            if (choice.equalsIgnoreCase("no")) {
                break;
            }

            System.out.println();
        }

        sc.close();
    }
}