package loop;

import java.util.Scanner;


public class loop_4 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = -1;
        while (age <= 0) {
            System.out.print("Enter your age : ");
            age = input.nextInt();

            if(age <=0){
                System.out.println("Invalid age , please enter a positive value");
            }
        }
    }
}
