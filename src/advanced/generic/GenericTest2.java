package advanced.generic;

public class GenericTest2<T, U> {
    T obj1;
    U obj2;

    GenericTest2(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print() {
        System.out.println(obj1);
        System.out.println(obj2);
    }

    public static void main(String[] args) {
        GenericTest2<String, Integer> obj = new GenericTest2<>("ABC", 10);

        obj.print(); // ABC 10
    }
}
