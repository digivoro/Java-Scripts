/**
 * Exercise34
 */
import java.util.Random;
import java.util.Scanner;


public class Exercise34 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int guess;
        System.out.println("I'm thinking of a random number between 1 and 100 (including both)."
            +" Can you guess what it is?");
        System.out.print("Type a number: ");
        guess=in.nextInt();
        System.out.println("The number I'm thinking of is: "+number);
        if (Math.abs(number-guess)==0) {
            System.out.println("You guessed it!");
        } else {
            System.out.println("You were off by "+Math.abs(number-guess));
        }
        in.close();

    }
}