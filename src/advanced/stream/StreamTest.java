package advanced.stream;

import java.util.List;

public class StreamTest {
    List<Integer> integerList = List.of(1,2,3,4,5);
    // map()
    List<Integer> streamIntList = integerList.stream().map(x -> x*x).toList();

    List<String> stringList = List.of("Reflection", "Collection", "Stream");
    // filter()
    List<String> streamStringList = stringList.stream().filter(s -> s.startsWith("S")).toList();

    public static void main(String[] args) {
        StreamTest streamTest = new StreamTest();
        System.out.println(streamTest.streamIntList); // 1 4 9 16 25
        System.out.println(streamTest.streamStringList); // Stream
    }
}
