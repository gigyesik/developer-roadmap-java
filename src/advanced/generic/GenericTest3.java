package advanced.generic;

public class GenericTest3 {
    static <T> void genericPrint(T element) {
        System.out.println(element.getClass().getName() + " = " + element);
    }

    public static void main(String[] args) {
        genericPrint(10); // java.lang.Integer = 10
        genericPrint("ABC"); // java.lang.String = ABC
    }
}
