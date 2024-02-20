package advanced;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet<String> set = new TreeSet<>();
        set.add("b");
        set.add("a");
        set.add("d");
        set.add("c");

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // a b c d
        }
    }
}
