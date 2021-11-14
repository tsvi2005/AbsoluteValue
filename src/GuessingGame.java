import java.util.Scanner;
// EXERCISE 10
public class GuessingGame {
    public static void main(String[] args) {
        int numberOfGuesseses = 1;
        final int LOW_NUMBER = 1;
        final int HIGH_NUMBER = 1000;
        int randomNumber = (int) ((Math.random() * (HIGH_NUMBER - LOW_NUMBER + 1)) + LOW_NUMBER);
        System.out.println("Guess a number between 1-1000");
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        do {
            System.out.println("Enter your guess");
            guess = scanner.nextInt();
            if (randomNumber > guess) {
                numberOfGuesseses++;
                System.out.println("Your number guess is lower than the number I chose");
            }
            if (randomNumber < guess){
                numberOfGuesseses++;
                System.out.println("Your number guess is higher than the number I chose");
            }
        } while (randomNumber != guess);
        int whichPlayer = (2-(numberOfGuesseses % 2));
        System.out.println("Player " + whichPlayer + " won after " + numberOfGuesseses + " guesses ");
    }
}
