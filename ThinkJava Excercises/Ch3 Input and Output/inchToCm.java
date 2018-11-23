/**
 * inchToCm
 */

 import java.util.Scanner;
public class inchToCm {

    public static void main(String[] args) {
        // Variables
        Scanner in = new Scanner(System.in);
        double inch, cm;
        final double CM_PER_INCH = 2.54;

        // Lógica
        System.out.print("Cuantas pulgadas? ");
        inch = in.nextDouble();
        in.close();
        cm = inch*CM_PER_INCH;
        System.out.println(inch+" pulgadas equivalen a "+cm+" centimetros.");
    }
}