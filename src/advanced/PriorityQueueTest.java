package advanced;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("head: " + queue.element()); // 1
        System.out.println("head: " + queue.peek()); // 1

        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // 1 2 3 4
        }

        queue.remove();
        queue.poll();

        Iterator<Integer> iterator2 = queue.iterator();
        while (iterator2.hasNext()) {
            System.out.println(iterator2.next()); // 3 4
        }
    }
}
