/**
 * CelsiustoFahrenheit
 * Exercise 3-2.
Write a program that converts a temperature from Celsius to Fahrenheit. It should (1)
prompt the user for input, (2) read a double value from the keyboard, (3) calculate
the result, and (4) format the output to one decimal place. For example, it should display
"24.0 C = 75.2 F".
Here is the formula. Be careful not to use integer division!
F = C × 9/5 + 32
 */
import java.util.Scanner;
public class CelsiustoFahrenheit {

    public static void main(String[] args) {
        
        double tempC;
        double tempF;
        final double C_TO_F_FACTOR = 9.0/5.0;
        final double C_TO_F_ADD = 32.0;
        Scanner in = new Scanner(System.in);
        
        System.out.println("*** Celsius to Fahrenheit conversor ***");
        System.out.print("Enter temperature in Celsius: ");
        tempC = in.nextDouble();
        tempF = tempC*C_TO_F_FACTOR+C_TO_F_ADD;
        System.out.printf("The temperature in Fahrenheit is %.3f", tempF);
    }
}