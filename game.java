package local_game;

import java.util.Random;
import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random(); // Generate random number -> upto 2
        int computerInput = random.nextInt(3);
        System.out.println("Choose the number from 0, 1, and 2. ");
        System.out.println("'0' for Rock, '1' for Paper and '2' for Scissors.");
        int userInput = sc.nextInt(); // Take User input
        // Logic behind the game
        if (userInput == 0 && computerInput == 2 || userInput == 2 && computerInput == 1
                || userInput == 1 && computerInput == 0) {
            System.out.println("You Won!");
        } else if (computerInput == userInput) {
            System.out.println("Tie!");
        } else if (userInput == 2 && computerInput == 0 || userInput == 1 && computerInput == 2
                || userInput == 0 && computerInput == 1) {
            System.out.println("You Lose!");
        } else {
            System.out.println("Invalid Input");
        }
        // Showing the computer
        if (computerInput == 0) {
            System.out.println("Computer choice is: " + "Rock");
        } else if (computerInput == 1) {
            System.out.println("Computer choice is: " + "Paper");
        } else {
            System.out.println("Computer choice is: " + "Scissor");
        }
    }
}
