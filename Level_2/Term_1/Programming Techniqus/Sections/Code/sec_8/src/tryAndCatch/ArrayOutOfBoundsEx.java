package tryAndCatch;

public class ArrayOutOfBoundsEx {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(arr[i]); // If i equals 5, it will throw an exception(ArrayIndexOutOfBoundsException)
            }
        } catch (ArrayIndexOutOfBoundsException e) { // catch the exception
            System.out.println("Exception caught");
        }
        System.out.println("Program continues");
    }
}
