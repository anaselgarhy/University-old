package tryAndCatch;

public class TryAndNumOfCatches {
    public static void main(String[] args) {
        int num;
        try {
            num = 8 / 0; // ArithmeticException
            System.out.println("num = " + num);
        } catch (ArithmeticException e) { // execute this block only if the exception is ArithmeticException
            e.printStackTrace();
            System.out.println("ArithmeticException");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
