/**
 * BooleanMethods
 * Methods can return boolean values, just like any other type,
 * which is often convenient for hiding tests inside methods
 * It is common to give boolean methods names that sound like yes/no questions.
 * Ex: isSingleDigit()
 */
public class BooleanMethods {

    /**
     * Tests whether x is a single digit integer
     * 
     * @param x the integer to test
     * @return true if x has one digit, false otherwise
     */
    public static boolean isSingleDigit(int x) {
        if (x > -10 && x < 10) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Shorter version of the same method:
     * The expression x > -10 && x < 10 has type boolean, 
     * so there is nothing wrong with returning it directly
     * 
     * @param x
     * @return
     */
    public static boolean isSingleDigit2(int x) {
        return x > -10 && x < 10;        
    }

    public static void main(String[] args) {
        System.out.println(isSingleDigit(2));
        boolean bigFlag = !isSingleDigit(13);
    }

    /**
     * Conditional statements often invoke boolean methods
     * and use the results as condition:
     * 
     * if (isSingleDigit(z)) {
     *      System.out.println("z is small");
     * } else {
     *      System.out.println("z is big");
     * }
     * 
     */
    
}