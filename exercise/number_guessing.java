package Bro_code_videos;

import java.util.Random;
import java.util.Scanner;

public class number_guessing {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1 , max = 100;
        int randomNumber = random.nextInt(min,max + 1);

        System.out.println("Number Guessing Game");
        System.out.printf("Guess a number between %d-%d\n" , min ,max);

        do {
            System.out.print("Enter a guess : ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < randomNumber ){
                System.out.println("TOO LOW! TRY AGAIN ");
            }
            else if (guess > randomNumber){
                System.out.println("TOO HIGH! TRY AGAIN ");
            }
            else {
                System.out.println("CORRECT ! The number was " + randomNumber);
                System.out.println("Number of attempts : " + attempts);
            }

        }while (guess != randomNumber);

        scanner.close();
    }
}
