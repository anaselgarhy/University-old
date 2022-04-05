// Create my thread class
class MyThread extends Thread {
    public void run() {
        System.out.println("MyThread is running");
    }
}
public class Threads_1 {
    public static void main(String[] args) {
        // Create my thread object
        MyThread mt = new MyThread();
        // Start my thread
        mt.start();
    }
}
