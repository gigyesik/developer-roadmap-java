package advanced.collectionFramework;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueTest {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<>();

        deque.add("a");
        deque.add("b");
        deque.add("c");

        for (String s : deque) {
            System.out.println(s); // a b c
        }
    }

}
