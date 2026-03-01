package CLG_PRACTICALS;

import java.util.Scanner;

class BillGenerator {

    int generateBill(int itemTotal) {
        return itemTotal;
    }

    int generateBill(int itemTotal, int discount) {
        return itemTotal - discount;
    }

    double generateBill(int itemTotal, double discountPercent) {
        double discountAmount = itemTotal * discountPercent / 100;
        return itemTotal - discountAmount;
    }
}

public class P_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BillGenerator bill = new BillGenerator();

        System.out.print("Enter total item amount: ");
        int total = sc.nextInt();

        System.out.println("Select Customer Type:");
        System.out.println("1. Regular");
        System.out.println("2. Privileged (Flat Discount)");
        System.out.println("3. Festive Offer (Percentage Discount)");

        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                int finalBill1 = bill.generateBill(total);
                System.out.println("Final Bill: " + finalBill1);
                break;

            case 2:
                System.out.print("Enter flat discount amount: ");
                int discount = sc.nextInt();
                int finalBill2 = bill.generateBill(total, discount);
                System.out.println("Final Bill: " + finalBill2);
                break;

            case 3:
                System.out.print("Enter discount percentage: ");
                double percent = sc.nextDouble();
                double finalBill3 = bill.generateBill(total, percent);
                System.out.println("Final Bill: " + finalBill3);
                break;

            default:
                System.out.println("Invalid choice");
        }

        sc.close();
    }
}