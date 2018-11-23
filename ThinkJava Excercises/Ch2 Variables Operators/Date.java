/**
 * ThinkJava
 * Ejercicio 2-2 
 * Time.java
 * p.26
 */
public class Date {
    public static void main(String[] args) {
        String day="Friday";
        String month="November";
        int date=13;
        int year=2018;
        //System.out.println(day);
        //System.out.println(month);
        //System.out.println(date);
        //System.out.println(year);
        System.out.println("American format:");
        System.out.println(day+", "+month+" "+date+", "+year);
        System.out.println("European format:");
        System.out.println(day+" "+date+" "+month+" "+year);
    }
}