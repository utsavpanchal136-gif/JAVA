package CLG_PRACTICALS;

import java.util.Scanner;

class BankAccount {

    String accountId;
    String accountHolderName;
    double balance;

    void assignValues(String id, String name, double bal) {
        accountId = id;
        accountHolderName = name;
        balance = bal;
    }

    void displayValues() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: " + balance);
        System.out.println();
    }
}

public class P_5 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            BankAccount[] accounts = new BankAccount[5];

            for (int i = 0; i < 5; i++) {
                accounts[i] = new BankAccount();
            }

            accounts[0].assignValues("A138", "Aryan", 5000);
            accounts[1].assignValues("A139", "Dev", 12000);
            accounts[2].assignValues("A136", "Parth", 8000);
            accounts[3].assignValues("A134", "Utsav", 15000);
            accounts[4].assignValues("A137", "Aarav", 6000);

            System.out.print("Enter Account ID to search: ");
            String searchId = sc.next();

            boolean found = false;

            for (int i = 0; i < 5; i++) {
                if (accounts[i].accountId.equals(searchId)) {
                    accounts[i].displayValues();
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Account not found.");
            }

            sc.close();
        }
    }

