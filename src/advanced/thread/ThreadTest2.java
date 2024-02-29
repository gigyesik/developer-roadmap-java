package advanced.thread;

public class ThreadTest2 {
    public static void main(String[] args) {
        Thread t = new Thread("Thread Running");

        t.start();

        String s = t.getName();
        System.out.println(s);
    }
}
