package Bro_code_videos;

import java.util.Scanner;

public class weight_converter {
    public static void main(String[] args) {
        // weight conversion program
        /*
        declare variables
        welcome message
        prompt for use choice
        option1 convert lbs to kgs
        option2 convert kgs to lbs
        else print not a valid choice
        */
        Scanner scanner = new Scanner(System.in);
        double weight , newWeight ;
        int choice;

        System.out.println();
        System.out.println("Weight conversion program");
        System.out.println("1 : convert lbs to kgs");
        System.out.println("2 : convert kgs to lbs");

        System.out.print("Choose an option : ");
        choice = scanner.nextInt();


        if (choice == 1){
            System.out.print("Enter the weight in lbs : ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is : %.2f " , newWeight);

        }
        else if (choice == 2){
            System.out.print("Enter the weight in kgs : ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is : %.2f " , newWeight);

        }
        else {
            System.out.println("That was not a valid choice");
        }


        scanner.close();
    }
}
