package advanced.thread;

public class ThreadTest5 implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(102);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("t1 invoked By t2, t1 state : " + ThreadState.t1.getState());

        try {
            Thread.sleep(202);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
