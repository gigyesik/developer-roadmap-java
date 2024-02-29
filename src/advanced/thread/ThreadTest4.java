package advanced.thread;

public class ThreadTest4 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread Running");
    }

    public static void main(String[] args) {
        Runnable r = new ThreadTest4();
        Thread t = new Thread(r, "Thread");

        t.start();

        String s = t.getName();
        System.out.println(s); // Thread
        // Thread Running
    }
}
