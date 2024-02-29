package advanced.thread;

public class ThreadTest3 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Running");
    }

    public static void main(String[] args) {
        ThreadTest3 threadTest3 = new ThreadTest3();
        Thread t = new Thread(threadTest3);
        t.start(); // Thread Running
    }
}
