package advanced.generic;

// <> 안에 파라미터 타입 특정
public class GenericTest1<T> {
    // T 선언
    T obj;
    GenericTest1(T obj) { this.obj = obj; }

    public T getObj() { return this.obj; }

    public static void main(String[] args) {
        GenericTest1<Integer> intObj = new GenericTest1<>(10);
        System.out.println(intObj.getObj());

        GenericTest1<String> stObj = new GenericTest1<>("ABC");
        System.out.println(stObj.getObj());
    }
}
