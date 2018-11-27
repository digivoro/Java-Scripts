/**
 * CalculateArea
 */
public class CalculateArea {

    public static void main(String[] args) {
        System.out.println(calculateArea(5));
    }

    /**
     * Calculates the area of a circle of radius "radius"
     * @param radius
     * @return
     */
    public static double calculateArea(double radius) { //Return type stated must match the return type of the method
        double result = Math.PI*radius*radius;
        return result;  
        //<Return immediately from this method and use the following expression as the return value.>      
        //return =  Math.PI*radius*radius; is also viable.
        //But temporary variables like result make debugging easier.
    }
}