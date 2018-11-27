/**
 * Exercise51
 */
public class Exercise51 {

    static int x=9;

    public static void main(String[] args) {
        if (x > 0) {
            if (x < 10) {
                System.out.println("positive single digit number.");
            }
        }

        if (x > 0 && x < 10) {
            System.out.println("positive single digit number.");
        }
    }
}