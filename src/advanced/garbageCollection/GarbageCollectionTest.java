package advanced.garbageCollection;

public class GarbageCollectionTest {
    public static void main(String[] args) {
        // Nulling Object
        GarbageCollectionTest g1 = new GarbageCollectionTest();
        g1 =  null;
        System.out.println(g1); // null

        // Assigning Reference to Another
        GarbageCollectionTest g2 = new GarbageCollectionTest();
        GarbageCollectionTest g3 = new GarbageCollectionTest();
        System.out.println(g2);
        System.out.println(g3);
        g2 = g3;
        System.out.println(g2);
    }
}
