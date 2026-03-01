package Bro_code_videos;

import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissors {
    static void main(String[] args) {
        /*
        declare variable
        get chocie from the user
        get random chocie from the computer
        check win conditions
        ask to play again?
        goodbye message
         */

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choice = {"rock","paper","scissors"};
        String playerchoice;
        String computerChoice;
        String playagain = "yes";

        do{

            System.out.print("enter your mopve (rock , paper , scissors): ");
            playerchoice = scanner.nextLine().toLowerCase();

            if (    !playerchoice.equals("rock") &&
                    !playerchoice.equals("paper") &&
                    !playerchoice.equals("scissors")){
                System.out.println("Invalid choice");
                continue;
            }

            computerChoice = choice[random.nextInt(3)];
            System.out.println("Computer choice : " + computerChoice);

            if (playerchoice.equals(computerChoice)){ // if we use == , then we compare memory address
                System.out.println("Its a Tie");
            } else if ((playerchoice.equals("rock") && computerChoice.equals("scissors")) ||
                    ((playerchoice.equals("paper") && computerChoice.equals("rock")) ||
                            ((playerchoice.equals("scissors") && computerChoice.equals("paper")))) ) {
                System.out.println("You win");
            }
            else {
                System.out.println("You lose");
            }

            System.out.print("Play again(yes/no): ");
            playagain = scanner.nextLine().toLowerCase();


        }while(playagain.equals("yes"));

        System.out.println();
        System.out.println("**Thanks for playing**");

        scanner.close();
    }
}
