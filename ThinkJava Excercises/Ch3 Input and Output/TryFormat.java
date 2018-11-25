/**
 * Exercise 3-1 TryFormat
 * When you use printf, the Java compiler does not check your format string. See what
 * happens if you try to display a value with type int using %f. And what happens if you
 * display a double using %d? What if you use two format specifiers, but then only provide
 * one value?
 */
public class TryFormat {

    public static void main(String[] args) {
        int val1 = 1;
        double val2 = 2.0;

        //Trying to display value with type int using %f
        System.out.printf("%f \n", val1);
        //-> Exception in thread "main" java.util.IllegalFormatConversionException: f != java.lang.Integer

        //Trying to display a value with type double using %d
        System.out.printf("%d", val2); 
        //-> Exception in thread "main" java.util.IllegalFormatConversionException: d != java.lang.Double

        //Trying to display a single value with two format specifiers
        System.out.printf("%f %d", val2); 
        //-> 2,000000 Exception in thread "main" java.util.MissingFormatArgumentException: Format specifier '%d'
    }
}