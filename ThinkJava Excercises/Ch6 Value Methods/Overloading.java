/**
 * Overloading
 * In java is legal to have two methods with the same name, 
 * as long as they take different parameters.
 */
public class Overloading {

    public static double distance(double x1, double y1, double x2, double y2) {
        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
    }

    //  CalculateArea() overloaded methods:

    public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
        }

    //  The next one is not a recursive method: 
    //  Java knows which version you want by looking at the arguments provided
    public static double calculateArea(double xc, double yc, double xp, double yp) {
        return calculateArea(distance(xc, yc, xp, yp));
    }
}