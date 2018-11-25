/**
 * Test
 */
public class Test {

    String asd;

    static void print(long l) {
        System.out.println(l);
    }

    public static void main(String[] args) {
        long a = 1231233497;
        long b = 484530405;

        long c = Math.subtractExact(a, b);
        print(c);
        
    }
}