class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println("MyThread is running");
    }
}
public class Threads_2 {
    public static void main(String[] args) {
        // Create my thread object
        MyThread mt = new MyThread();
        // Start my thread
        Thread t = new Thread(mt);
        t.start();
    }
}
