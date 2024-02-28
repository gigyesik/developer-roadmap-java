package advanced.stream;

import java.util.List;

public class StreamTest {
    List<Integer> integerList = List.of(1,2,3,4,5);


    List<Integer> streamIntList = integerList.stream().map(x -> x*x).toList();
    public static void main(String[] args) {
        StreamTest streamTest = new StreamTest();
        System.out.println(streamTest.streamIntList); // 1 4 9 16 25
    }
}
