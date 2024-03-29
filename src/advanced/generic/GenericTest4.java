package advanced.generic;

import java.util.ArrayList;

public class GenericTest4<T> {
    T obj;
    GenericTest4(T obj) { this.obj = obj; }
    public T getObj() { return this.obj; }

    public static void main(String[] args) {
        GenericTest4<Integer> intObj = new GenericTest4<>(10);
        System.out.println(intObj.getObj()); // 10

        // GenericTest4<int> iObj = new GenericTest4<int>(22); // primitive type 불가
        GenericTest4<ArrayList<int[]>> aiObj = new GenericTest4<>(new ArrayList<>()); // ArrayList 가 이미 referenced type 이므로 가능

        GenericTest4<String> stObj = new GenericTest4<>("ABC");
        System.out.println(stObj.getObj()); // ABC

        // intObj = stObj; // error
    }
}
