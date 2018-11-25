/**
 * ScannerBug
 */

 import java.util.*;

public class ScannerBug {

    public static void main(String[] args) {
        String name;
        int age;
        Scanner in = new Scanner(System.in);

        //  No problem when you read String and then the int
        // System.out.print("What is your name? ");
        // name = in.nextLine();
        // System.out.print("What is your age? ");
        // age = in.nextInt();

        //  When you read Int first, however, the program bugs:
        // System.out.print("What is your age? ");
        // age = in.nextInt();
        // System.out.print("What is your name? ");
        // name = in.nextLine();

        //Scanner reads a STREAM of characters (not separate lines)
        //So we need to add another scanner to read the new line character "\n" 
        //Otherwise it will return just the empty string "".
        System.out.print("What is your age? ");
        age = in.nextInt();
        in.nextLine(); // read the newline
        System.out.print("What is your name? ");
        name = in.nextLine();

        System.out.printf("Hello %s, age %d\n", name, age);
        in.close();
    }
}