/**
 * Exercise104
 */

import java.math.BigInteger;

public class Exercise104 {

    
    public static void main(String[] args) {
        System.out.println("Factorials table:");
        printFactorial(3000); // Tried with 10000 and crashed.
    }

    public static BigInteger factorial(int n) {
        if (n==0) {
            return BigInteger.valueOf(1);
        } 
        return BigInteger.valueOf(n).multiply(factorial(n-1)); // n! = n*(n-1)!
    }

    public static void printFactorial(int n){
        if (n>=0) {
            printFactorial(n-1);
            System.out.println(n+"! = "+factorial(n));
            return;
        }
    }
}