/**
 * Exercise42
 */
public class Exercise42 {

    public static void main(String[] args) {
        zool(1, "cosita", "Los pensamientos");
        printAmerican("Sunday", "November", 15, 1987);
        printEuropean("Sunday", "November", 15, 1987);
    }

    static void zool(int i, String s1, String s2){

    }

    static void printAmerican(String day, String month, int date, int year){
        System.out.println("American format:");
        System.out.println(day+", "+month+" "+date+", "+year);
    }

    static void printEuropean(String day, String month, int date, int year){
        System.out.println("European format:");
        System.out.println(day+" "+date+" "+month+" "+year);
    }
}