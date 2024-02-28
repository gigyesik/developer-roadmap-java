package advanced.stream;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamTest {
    List<Integer> integerList = List.of(1,2,3,4,5);
    // map()
    List<Integer> streamIntList = integerList.stream().map(x -> x*x).toList();

    List<String> stringList = List.of("Reflection", "Collection", "Stream");
    // filter()
    List<String> streamStringList = stringList.stream().filter(s -> s.startsWith("S")).toList();

    // sorted()
    List<String> sortedStringList = stringList.stream().sorted().toList();

    List<Integer> integerList2 = List.of(2,4,2,5,4);
    // collect()
    Set<Integer> streamIntSet = integerList2.stream().collect(Collectors.toSet());

    public static void main(String[] args) {
        StreamTest streamTest = new StreamTest();
        System.out.println(streamTest.streamIntList); // [1, 4, 9, 16, 25]
        System.out.println(streamTest.streamStringList); // [Stream]
        System.out.println(streamTest.sortedStringList); // [Collection, Reflection, Stream]
        System.out.println(streamTest.streamIntSet); // 2, 4, 5
        // forEach()
        streamTest.integerList.stream().forEach(s -> System.out.println(s)); // 1 2 3 4 5
    }
}
