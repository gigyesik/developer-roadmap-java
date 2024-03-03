package advanced.thread;

public class ThreadState implements Runnable {
    public static Thread t1;
    public static ThreadState s1;

    @Override
    public void run() {
        ThreadTest5 tt = new ThreadTest5();
        Thread t2 = new Thread(tt);

        t2.start();
        System.out.println("t2 invoking start(), t2 state : " + t2.getState());

        try {
            Thread.sleep(202);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("t2 invoking sleep(), t2 state : " + t2.getState());

        try {
            t2.join();
            System.out.println("t2 invoking join(), t2 state : " + t2.getState());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("t1 after complete, t1 state : " + t1.getState());
    }

    public static void main(String[] args) {
        s1 = new ThreadState();
        t1 = new Thread(s1);
        System.out.println("t1 not start yet, t1 state : " + t1.getState());

        t1.start();
        System.out.println("t1 invoking start(), t1 state : " + t1.getState());

//        t1 not start yet, t1 state : NEW
//        t1 invoking start(), t1 state : RUNNABLE
//        t2 invoking start(), t2 state : RUNNABLE
//        t1 invoked By t2, t1 state : TIMED_WAITING
//        t2 invoking sleep(), t2 state : TIMED_WAITING
//        t2 invoking join(), t2 state : TERMINATED
//        t1 after complete, t1 state : RUNNABLE
    }
}
