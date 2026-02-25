package Bro_code_videos;

import java.util.Random;
import java.util.Scanner;

public class Dice_roller_program {
    public static void main(String[] args) {
        // JAVA DICE ROLLER
        /*
        DECALRE VARIABLE
        GET NO OF DICE FROM THE USER
        CHECK IF NO DICE > 0
        ROLL ALL THE DICE
        GET THE TOTOAL
        DISPLAY ASCII OF DICE
         */
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numofdice ;
        int total = 0;


        System.out.print("Enter the no of dice the roll : ");
        numofdice = scanner.nextInt();

        if (numofdice > 0){
            for (int i = 0 ; i < numofdice ; i++){
                int roll = random.nextInt(1,7);
                printDie(roll);
                System.out.println("You rolled : " + roll);

                total += roll;
            }
            System.out.println("Total:  " + total);
        }
        else {
            System.out.println("No of dice is must be greater than 0 ");
        }
    }

    static void printDie(int roll) {
        String dice1 = """
                  -------
                 |       |
                 |   ●   |
                 |       |
                  -------
                 """;

        String dice2 = """
                  -------
                 |●      |
                 |       |
                 |      ●|
                  -------
                 """;

        String dice3 = """
                  -------
                 |●      |
                 |   ●   |
                 |      ●|
                  -------
                 """;

        String dice4 = """
                  -------
                 |●     ●|
                 |       |
                 |●     ●|
                  -------
                 """;


        String dice5 = """
                  -------
                 |●     ●|
                 |   ●   |
                 |●     ●|
                  -------
                 """;


        String dice6 = """
                  -------
                 |●     ●|
                 |●     ●|
                 |●     ●|
                  -------
                 """;


        switch (roll){

            case 1 -> System.out.print(dice1);
            case 2 -> System.out.print(dice2);
            case 3 -> System.out.print(dice3);
            case 4 -> System.out.print(dice4);
            case 5 -> System.out.print(dice5);
            case 6 -> System.out.print(dice6);
            default -> System.out.println("Invalid roll");
        }
    }
}
