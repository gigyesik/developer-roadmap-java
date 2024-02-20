package advanced.collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Long> longLinkedList = new LinkedList<>();
        longLinkedList.add(1L);
        longLinkedList.add(2L);
        longLinkedList.add(3L);
        longLinkedList.add(4L);

        Iterator<Long> iterator = longLinkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
