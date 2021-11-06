import java.util.ArrayList;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        ArrayList<Float> grads = new ArrayList<>();

        try {
            // reda greads
            System.out.print("Enter grades, enter any char to exit.");
            do {
                System.out.print("> ");
            } while ((grads.add(new Scanner(System.in).nextFloat())));
        } catch (Exception ignored){}
            // to array
            float[] array = toArray(grads);
            // print
            System.out.println("max grade = " + max(array));
            System.out.println("average grade = " + average(array));
            System.out.println("count grade = " + count(array));
    }
    private static float max(float[] numbers) {
        float max = Float.MIN_VALUE;
        for (float number : numbers)
            if (number > max)
                max = number;
        return max;
    }

    private static float average(float[] numbers) {
        float sum = 0;
        for (float number : numbers)
            sum += number;
        return sum / numbers.length;
    }

    private static float count(float[] numbers) {
        float count = 0;
        for (float number : numbers)
            if (number > 50)
                count++;
        return count;
    }

    private static float[] toArray(ArrayList<Float> arrayList) {
        float[] arr = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            arr[i] = arrayList.get(i);
        }
        return arr;
    }
}
