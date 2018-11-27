/**
 * Exercise56
 * 
 * 1. Write the number 1 next to the first line of code in this program that will execute.
 * 2. Write the number 2 next to the second line of code, and so on until the end of the program. 
 * If a line is executed more than once, it might end up with more than one number next to it.
 * 3. What is the value of the parameter blimp when baffle gets invoked? A: quince
 * 4. What is the output of this program?
 */

public class Exercise56 {                                   //Order of execution

    public static void baffle(String blimp) {
        System.out.println(blimp);                          // 4
        zippo("ping", -5);                                  // 5
    }
    public static void zippo(String quince, int flag) {     
        if (flag < 0) {                                     
            System.out.println(quince + " zoop");           // 6
        } else {
            System.out.println("ik");                       // 2
            baffle(quince);                                 // 3
            System.out.println("boo-wa-ha-ha");             // 7
        }
    }
    public static void main(String[] args) {
        zippo("rattle", 13);                                // 1
    }
}

/**
 * 4. Expected Output:
 * ik
 * quince
 * ping zoop
 * boo-wa-ha-ha
 * 
 */