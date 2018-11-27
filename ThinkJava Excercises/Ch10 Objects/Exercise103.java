/**
 * Exercise 10-3.
 * This exercise is about aliasing. 
 * Recall that aliases are two variables that refer to the same object.
 * 1.   Draw a diagram that shows the state of the program just before the end of main.
 *      Include all local variables and the objects they refer to.
 * 2.   What is the output of the program?
 * 3.   At the end of main, are p1 and p2 aliased? Why or why not?
 */

import java.awt.*;

public class Exercise103 {

    public static void printPoint(Point p) {
        System.out.println("(" + p.x + ", " + p.y + ")");
    }

    public static Point findCenter(Rectangle box) {
        int x = box.x + box.width / 2;
        int y = box.y + box.height / 2;
        return new Point(x, y);
    }

    public static void main(String[] args) {
        Rectangle box1 = new Rectangle(2, 4, 7, 9);
        Point p1 = findCenter(box1);
        printPoint(p1);
        box1.grow(1, 1);
        Point p2 = findCenter(box1);
        printPoint(p2);
    }
}
/**
 * Variable tracking:
 * p1 = (5,8)
 * p2 = (5,8) (center doesn't move)
 * 
 * Expected output:
 * (5,8)
 * (5,8)
 * 
 * p1 and p2 ARE indeed aliased.
 */