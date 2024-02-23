package advanced.generic;

public class GenericTest4<T> {
    T obj;
    GenericTest4(T obj) { this.obj = obj; }
    public T getObj() { return this.obj; }

    public static void main(String[] args) {
        GenericTest4<Integer> intObj = new GenericTest4<>(10);
        System.out.println(intObj.getObj()); // 10

        GenericTest4<String> stObj = new GenericTest4<>("ABC");
        System.out.println(stObj.getObj()); // ABC

        // intObj = stObj; // error
    }
}
