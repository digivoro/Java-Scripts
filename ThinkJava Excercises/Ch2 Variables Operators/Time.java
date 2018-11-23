/**
 * ThinkJava
 * Ejercicio 2-3 
 * Time.java 
 * p.27
 */
public class Time {
    public static void main(String[] args) {
        int hour, minute, second;
        hour = 1;
        minute = 58;
        second = 37;

        //Segundos desde medianoche:
        int desdeMedianoche=hour*60*60+minute*60+second;
        System.out.println("Han pasado "+desdeMedianoche+" segundos desde medianoche.");

        //Porcentaje del día que ha pasado:
        double segundosDia=24.0*60.0*60.0;
        double porcentDia = desdeMedianoche/segundosDia*100.0;
        System.out.println("Ha pasado un "+porcentDia+"% del dia.");

        //Tiempo desde inicio del ejercicio:
        hour = 2;
        minute = 37;
        second = 22;
        System.out.println("Han pasado "+Math.abs(desdeMedianoche-hour*60*60-minute*60-second)+" segundos desde que empece el ejercicio.");
    }
}