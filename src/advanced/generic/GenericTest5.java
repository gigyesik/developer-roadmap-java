package advanced.generic;

public class GenericTest5 {
    // 원시타입이 아닌 타입을 비교하려면 Comparable 클래스를 상속해야함
    public static <T extends Comparable<T>> void sortGeneric(T[] array) {
        // Bubble Sort
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j+1]) > 0) swap(j, j+1, array);
            }
        }

        // Print
        for (T i : array) {
            System.out.println(i + ", ");
        }
        // 줄바꿈
        System.out.println();
    }

    public static <T> void swap(int i, int j, T[] array) {
        T t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void main(String[] args) {
        Integer[] integers = {20, 30, 50, 40, 10};
        Character[] characters = {'c', 'b', 'a', 'd', 'e'};
        String[] strings = {"ABC", "CBA", "BAC", "CAB", "ACB"};

        sortGeneric(integers); // 10 20 30 40 50
        sortGeneric(characters); // a b c d e
        sortGeneric(strings); // ABC ACB BAC CAB CBA
    }
}
