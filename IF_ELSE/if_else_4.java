package if_else;

import java.util.Scanner;

public class if_else_4 {
    public static void main(String[] args) {
        int a;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: ");
        a = sc.nextInt();

        if (a > 0) {
            System.out.println("The number is positive");
        } else if (a < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is zero");
        }


    }
}
