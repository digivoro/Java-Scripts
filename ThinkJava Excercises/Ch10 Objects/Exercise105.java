/**
 * Exercise105
 */

import java.math.BigInteger;

public class Exercise105 {

    public static void main(String[] args) {
        int x = 3;
        int n = 600;
        System.out.println(pow(x, n));
    }

    /**
     * Find x to the n/2 recursively
     * @param x
     * @param n
     * @return if n is odd, the result is t squared times x
     * @return if n is even, the result is t squared 
     */
    public static BigInteger pow(int x, int n) {
        if (n == 0) {
            return BigInteger.valueOf(1);
        }

        BigInteger t = pow(x, n / 2);

        if (n % 2 == 0) {
            return t.multiply(t);
        } else {
            return t.multiply(t).multiply(BigInteger.valueOf(x));
        }
    }
}

