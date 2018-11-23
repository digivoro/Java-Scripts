/**
 * Formatted
 */
public class Formatted {

    public static void main(String[] args) {

        System.out.printf("Cuatro tercios = %.3f\n", 4.0/3.0);
        /*      
        System.out.printf(String_de_formato, Otro_String)
        String de formato: String comun y corriente + Especificador de formato
        %.3f -> El valor siguiente (Otro_String) debe ser float (decimal), redondeado al 3er lugar
        */

        final double CM_PER_INCH = 2.54;
        int inch = 100;
        double cm = inch * CM_PER_INCH;

        System.out.printf("%d in = %f cm\n", inch, cm);
        /*
        En este caso se usan dos especificadores de formato, por lo que luego hay dos valores.
        Los formatos se aplican a los valores en el mismo orden en que aparecen.
        %d (decimal) muestra valores enteros
        %f (float) muestra como decimal
        Comunmente se finaliza con un caracter de nueva linea, ya que printf no produce nueva linea.
        */    
        /*
        Formatos comunes:

        %d      entero                                              12345
        %08d    rellenado con ceros, al menos 8 digitos de ancho    00012345
        %f      punto flotante                                      6.789000
        %.2f    redondeado a dos decimales                          6.79
        */
    }
}