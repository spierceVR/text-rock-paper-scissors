import java.util.Scanner;
import java.util.Random;
/* RPS text Game created by Solomon 6/17/2020

 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Welcome to rock paper scissors V0.1 by Solomon");



        while(true) {
            game();
            pressEnterToPlayAgain();

        }



    }

    private static void pressEnterToPlayAgain()
    {
        System.out.println("Press Enter key to play again...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

    private static void game() {
        System.out.println("Please input rock paper or scissors");

        Scanner input = new Scanner(System.in);
        Random rand = new Random();


        String userInput = input.nextLine();

        int winningChoiceNum = rand.nextInt(2);

        String cpuChoice;

        switch (winningChoiceNum) {
            case 0:
                cpuChoice = "rock";
                break;
            case 1:
                cpuChoice = "paper";
                break;
            case 2:
                cpuChoice = "scissors";
                break;
            default:
                cpuChoice = "a";
                System.out.println("Error: Please input a valid choice in lowercase");
        }

        if (userInput.equals(cpuChoice)) {
            System.out.println("The computer's choice is " + cpuChoice);
            System.out.println("You tied!");
        } else if (userInput.equals("rock") && cpuChoice.equals("paper")) {
            System.out.println("The computer's choice is " + cpuChoice);
            System.out.println("You lose!");
        } else if (userInput.equals("paper") && cpuChoice.equals("rock")) {
            System.out.println("The computer's choice is " + cpuChoice);
            System.out.println("You win!");
        } else if (userInput.equals("scissors") && cpuChoice.equals("rock")) {
            System.out.println("The computer's choice is " + cpuChoice);
            System.out.println("You lose!");
        } else if (userInput.equals("rock") && cpuChoice.equals("scissors")) {
            System.out.println("The computer's choice is " + cpuChoice);
            System.out.println("You win!");
        } else if (userInput.equals("scissors") && cpuChoice.equals("paper")) {
            System.out.println("The computer's choice is " + cpuChoice);
            System.out.println("You win!");
        } else if (userInput.equals("paper") && cpuChoice.equals("scissors")) {
            System.out.println("The computer's choice is " + cpuChoice);
            System.out.println("You lose!");
        }

    }
}

