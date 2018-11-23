import java.util.Scanner;
public class Try {
    public static void main(String[] args) {
        String line;
        Scanner in = new Scanner(System.in);

        System.out.println("Escribe algo:");
        line = in.nextLine();
        System.out.println("Escribiste puras weas ("+line+").");
        
        System.out.println("Escribe algo interesante, po:");
        line = in.nextLine();
        System.out.println("Dale. Sigue escribiendo challa ("+line+").");
    }
}