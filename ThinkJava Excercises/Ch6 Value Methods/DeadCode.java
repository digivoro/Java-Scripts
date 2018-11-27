/**
 * DeadCode
 */
public class DeadCode {

    public static void main(String[] args) {
        
    }

    public static double absoluteValue(double x) {
        if (x < 0) {
            return -x;
        } else {
            return x;
        }
        //System.out.println("This line is dead."); //Dead code. Compiler says it is 'unreachable'
        /**
         * If you use a return statement inside a conditional, 
         * make sure that every possible path reaches a return statemt
         */
    }
}