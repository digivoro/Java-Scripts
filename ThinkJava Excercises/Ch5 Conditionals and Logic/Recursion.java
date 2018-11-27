/**
 * Recursion
 * Methods that invoke themselves are called Recursive.
 * They have a Base case, when the base case is reached
 * the method ends.
 * If there's no base case or if it is never reached, the stack
 * grows forever (in theory). In practice, the stack has limited size
 * Upon exceeding this limit you get a StackOverflowError.
 */

public class Recursion {

    public static void main(String[] args) {
        countdown(5);
        nLines(4);
        System.out.println("End.");
    }

    public static void countdown(int n) {
        if (n == 0) { //Base case of the recursive method
            System.out.println("Blastoff!");
        } else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    public static void nLines(int n) {
        if (n > 0) { //Base case
        System.out.println();
        nLines(n - 1);
        }
        }
}