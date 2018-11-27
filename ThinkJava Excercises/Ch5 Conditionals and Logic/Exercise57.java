/**
 * Exercise34
 */
import java.util.Random;
import java.util.Scanner;


public class Exercise57 {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a random number between 1 and 100 (including both)."
            +" Can you guess what it is?");
        int guess = 0;
        guessGame(number, guess);
    }

    public static void guessGame(int number, int guess) {
        Scanner in = new Scanner(System.in);
        System.out.print("Guess my number: ");
        guess = in.nextInt();

        if (number-guess>0) {
            System.out.println("Nope! My number is higher. Try again");
            guessGame(number, guess);
        } else if (number-guess<0) {
            System.out.println("Nope! My number is lower. Try again");
            guessGame(number, guess);
        } else {
            System.out.println(number+"! You guessed it!");
            return;
        }
    }
}
