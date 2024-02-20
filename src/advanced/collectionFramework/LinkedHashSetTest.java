package advanced.collectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // a b c d
        }
    }
}
