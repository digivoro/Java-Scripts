/**
 * Return
 * The return statement allows you to terminate a method before you reach the end 
 * of it. One reason to use return is if you detect an error condition:
 */
import java.util.Scanner;

public class Return {

    public static void main(String[] args) {
        scanDouble();
    }

    public static void printLogarithm(double x) {
        if (x <= 0.0) {
            System.err.println("Error: x must be positive.");
            return;
        }
        double result = Math.log(x);
        System.out.println("The log of x is " + result);
    }

    public static void scanDouble() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        //Method hasNextDouble() provided by Scanner class. 
        //Checks if input stream can be interpreted as double
        if (!in.hasNextDouble()) {
            String word = in.next();
            System.err.println(word + " is not a number");
            in.close();
            return;
        }
        double x = in.nextDouble();
        printLogarithm(x);
        in.close();
    }

}