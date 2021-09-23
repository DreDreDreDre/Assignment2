package ex32;
import java.util.Scanner;
import java.lang.Math;

public class App32
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String difficultyInput = "";
        String guessInput = "";
        String playAgainInput = "";
        int difficulty;
        int guess = 0;
        int realValue = -1;
        int numGuesses = 0;

        do
        {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");

            do {
                difficultyInput = sc.nextLine();
                if (!difficultyInput.equals("1") && !difficultyInput.equals("2") && !difficultyInput.equals("3")) {
                    System.out.print("Invalid input. Enter a number: ");
                }
            } while (!difficultyInput.equals("1") && !difficultyInput.equals("2") && !difficultyInput.equals("3"));

            difficulty = Integer.parseInt(difficultyInput);

            if (difficulty == 1) {
                realValue = 1 + (int) (Math.random() * ((10 - 1) + 1));
            } else if (difficulty == 2) {
                realValue = 1 + (int) (Math.random() * ((100 - 1) + 1));
            } else if (difficulty == 3) {
                realValue = 1 + (int) (Math.random() * ((1000 - 1) + 1));
            }

            System.out.print("I have my number. What's your guess? ");

            do {
                guessInput = sc.nextLine();
                if (!guessInput.matches("[0123456789]+")) {
                    System.out.print("Invalid input. Enter a number: ");
                } else {
                    numGuesses++;
                    guess = Integer.parseInt(guessInput);
                    if (guess > realValue) {
                        System.out.print("Too high. Guess again: ");
                    } else if (guess < realValue) {
                        System.out.print("Too low. Guess again: ");
                    } else if (guess == realValue) {
                        if (numGuesses > 1) {
                            System.out.println("You got it in " + numGuesses + " guesses!");
                        } else if (numGuesses == 1) {
                            System.out.println("You got it in " + numGuesses + " guess!");
                        }
                    }
                }
            } while (guess != realValue);

            System.out.print("Do you wish to play again (Y/N)? ");

            do
            {
                playAgainInput = sc.nextLine();
                if(!playAgainInput.equals("Y") && !playAgainInput.equals("y") && !playAgainInput.equals("N") && !playAgainInput.equals("n"))
                {
                    System.out.print("Invalid input. Enter Y/N: ");
                }
            }while(!playAgainInput.equals("Y") && !playAgainInput.equals("y") && !playAgainInput.equals("N") && !playAgainInput.equals("n"));

            numGuesses = 0;
        }while(playAgainInput.equals("y") || playAgainInput.equals("Y"));
    }
}
