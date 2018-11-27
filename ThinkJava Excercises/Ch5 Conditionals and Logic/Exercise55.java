/**
 * Exercise55
 * Write a program that displays the entire lyrics of <99 Bottles of Beer>. 
 * Your program should include a recursive method that does the hard part, 
 * but you might want to write additional methods to separate other parts of the program.
 * 
 * <99 Bottles of Beer> Lyrics:
 *      99 bottles of beer on the wall,
 *      99 bottles of beer,
 *      ya’ take one down, ya’ pass it around,
 *      98 bottles of beer on the wall.
 * 
 * Last verse:
 * 
 *      No bottles of beer on the wall,
 *      no bottles of beer,
 *      ya’ can’t take one down, ya’ can’t pass it around,
 *      ’cause there are no more bottles of beer on the wall!
 */
public class Exercise55 {

    public static void main(String[] args) {
        sing(5);
    }

    public static void sing(int n) {
        if (n==0) {
            System.out.println("No bottles of beer on the wall,");
            System.out.println("no bottles of beer,");
            System.out.println("ya' can't take one down, ya' can't pass it around,");
            System.out.println("'cause there are no more bottles of beer on the wall!");
        } else if (n==1) {
            System.out.println(n+" bottles of beer on the wall,");
            System.out.println(n+" bottles of beer,");
            System.out.println("ya' take one down, ya' pass it around,");
            System.out.println("No bottles of beer on the wall.");
            System.out.println();
            sing(n-1);

        } else {
            System.out.println(n+" bottles of beer on the wall,");
            System.out.println(n+" bottles of beer,");
            System.out.println("ya' take one down, ya' pass it around,");
            System.out.println((n-1)+" bottles of beer on the wall.");
            System.out.println();
            sing(n-1);
        }
        
    }
}