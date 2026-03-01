package CLG_PRACTICALS;

import java.util.Scanner;

class LoanCalculator {

    // Home Loan
    double calculateEMI(int principal, int time, float rate) {

        double r = rate / (12 * 100);
        return (principal * r * Math.pow(1 + r, time)) /
                (Math.pow(1 + r, time) - 1);
    }

    // Vehicle Loan
    double calculateEMI(double principal, int time, double rate) {

        double r = rate / (12 * 100);
        return (principal * r * Math.pow(1 + r, time)) /
                (Math.pow(1 + r, time) - 1);
    }

    // Personal Loan (Fixed 10%)
    double calculateEMI(int principal, int time) {

        double rate = 10;
        double r = rate / (12 * 100);

        return (principal * r * Math.pow(1 + r, time)) /
                (Math.pow(1 + r, time) - 1);
    }
}

public class P_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LoanCalculator loan = new LoanCalculator();

        System.out.println("Select Loan Type:");
        System.out.println("1. Home Loan");
        System.out.println("2. Vehicle Loan");
        System.out.println("3. Personal Loan (Fixed 10%)");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter Principal Amount: ");
                int homePrincipal = sc.nextInt();

                System.out.print("Enter Time (in months): ");
                int homeTime = sc.nextInt();

                System.out.print("Enter Interest Rate (annual %): ");
                float homeRate = sc.nextFloat();

                double homeEMI = loan.calculateEMI(homePrincipal, homeTime, homeRate);
                System.out.printf("Home Loan EMI: %.2f\n", homeEMI);
                break;

            case 2:
                System.out.print("Enter Principal Amount: ");
                double vehiclePrincipal = sc.nextDouble();

                System.out.print("Enter Time (in months): ");
                int vehicleTime = sc.nextInt();

                System.out.print("Enter Interest Rate (annual %): ");
                double vehicleRate = sc.nextDouble();

                double vehicleEMI = loan.calculateEMI(vehiclePrincipal, vehicleTime, vehicleRate);
                System.out.printf("Vehicle Loan EMI: %.2f\n", vehicleEMI);
                break;

            case 3:
                System.out.print("Enter Principal Amount: ");
                int personalPrincipal = sc.nextInt();

                System.out.print("Enter Time (in months): ");
                int personalTime = sc.nextInt();

                double personalEMI = loan.calculateEMI(personalPrincipal, personalTime);
                System.out.printf("Personal Loan EMI: %.2f\n", personalEMI);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}