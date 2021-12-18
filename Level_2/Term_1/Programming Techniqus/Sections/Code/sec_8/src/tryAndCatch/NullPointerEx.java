package tryAndCatch;

public class NullPointerEx {
    public static void main(String[] args) {
        String str = null;
        try {
            System.out.println(str.length()); // throws NullPointerException
        } catch (NullPointerException e) { // catches NullPointerException
            System.out.println("NullPointerException caught");
        }
        /*
         * But, it is recommended that we make sure that the pointer is not equal null with the if statement.
         */

        System.out.println("Program continues");
    }
}
