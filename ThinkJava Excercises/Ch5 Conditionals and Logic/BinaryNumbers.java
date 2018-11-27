/**
 * BinaryNumbers
 * 
 */
public class BinaryNumbers {

    public static void main(String[] args) {
        countup(3);
        displayBinary(23);
    }
/**
 * countup() makes the sysout just before each recursive call returns.
 * As a result, it counts up.
 * This behavior comes in handy when you need to compute results and display in reverse order.
 */
    public static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        } else {
            countup(n - 1);
            System.out.println(n);
        }
    }
/**
 * @param value
 * If value is zero, displayBinary does nothing (that’s the base case). 
 * If the argument ispositive, the method divides it by two and calls displayBinary recursively. 
 * When therecursive call returns, the method displays one digit of the result and returns (again).
 */
    public static void displayBinary(int value) {
        if (value>0){
            displayBinary(value/2);
            System.out.print(value%2);
        }
    }

}