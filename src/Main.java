import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean guessed = false;
        int numberOfTries = 5;
        int numberToGuess = new Random().nextInt(100);
        Scanner sc = new Scanner(System.in);

        System.out.println("Start guessing the integer from 0 to 99");
        try {
            while (numberOfTries > 0) {
                int enteredNumber = sc.nextInt();
                numberOfTries--;

                if (enteredNumber == numberToGuess) {
                    System.out.println("You guessed it!");
                    guessed = true;
                    break;
                }
                if (enteredNumber > numberToGuess) {
                    System.out.println("Your number is GREATER than the one you are trying to guess");
                }
                if (enteredNumber < numberToGuess) {
                    System.out.println("Your number is LOWER than the one you are trying to guess");
                }

                System.out.println("You have " + numberOfTries + " more tries");

                if (numberOfTries != 0) {
                    System.out.println("Please try again");
                }
            }

            if (!guessed) {
                System.out.println("Sorry you didn't guess the number, the answer was: " + numberToGuess);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Not a integer");
        }
    }
}