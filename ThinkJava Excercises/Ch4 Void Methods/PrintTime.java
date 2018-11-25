/**
 * ThinkJava p.50
 * printTime has two parameters, named hour and minute. And main has two variables,
 * also named hour and minute. Although they have the same names, these variables are
 * not the same. hour in printTime and hour in main refer to different storage locations, 
 * and they can have different values.  
 */

public class PrintTime {

    public static void printTime(int hour, int minute) {
        System.out.print(hour);
        System.out.print(":");
        System.out.println(minute);
    }

    public static void main(String[] args) {
        int hour = 11;
        int minute = 59;
        printTime(hour, minute);
    }
}