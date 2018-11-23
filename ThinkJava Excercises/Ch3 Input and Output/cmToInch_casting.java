/**
 * cmToInch
 * Debido a que centimetros (cm) es double y pulgadas (inch) es int,
 * no se puede asignar directamente inch = cm / CM_PER_INCH;
 */

import java.util.Scanner; 
public class cmToInch_casting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inch;
        double cm;
        final double CM_PER_INCH = 2.54;

        /**
         * La sentencia <inch = cm / CM_PER_INCH;> produce un error de sintaxis porque no se puede guardar un valor 
         * double (mas grande) en una variable int (mas pequeña). 
         * Necesitamos usar <type cast> para cambiar de tipos acorde a lo que necesitemos.
         * 
         * Esto es:
         * double pi = 3.141519;
         * int x = (int) pi;
         * 
         * (int) convierte lo que sigue en un entero, redondeando siempre hacia abajo (simplemente elimina la 
         * parte fraccional). En este caso x==3.
         * 
         * Castear tipos tiene prioridad sobre operaciones aritmeticas.
         * < x = (int) pi*20; > produce un 60 en lugar de 62.
         */

        inch = (int) (cm / CM_PER_INCH);
        System.out.printf("%f cm = %d in\n", cent, inch);

    }

}