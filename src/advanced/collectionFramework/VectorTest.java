package advanced.collectionFramework;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {
    public static void main(String[] args) {
        Vector<String > stringVector = new Vector<>();
        stringVector.add("a");
        stringVector.add("b");
        stringVector.add("c");
        stringVector.add("d");

        Iterator<String> iterator = stringVector.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()); // a b c d
        }
    }
}
