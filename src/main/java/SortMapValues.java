import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Map.*;

public class SortMapValues {

    public static void main(String[] args) {

//        Stream.iterate(1, e -> e + 1)
//                        .limit(50)
//                                .forEach(i -> sample());
        print("Hello World!").run();

    }

    public static void sample(){
        List<Integer> list = IntStream.range(1, 1001).boxed().toList();
        List<Integer> destinationList = new ArrayList<>();
        list.parallelStream()
                .forEach(destinationList::add);
        System.out.println(destinationList.size());
    }

    public static Runnable print(String s){
        return () -> System.out.println(s);
    }
//    5) Sort map by values
   public static void sortByValue(Map<Integer, String> stringMap){
//      List<Map.Entry<Integer, String>> tempMap =stringMap.entrySet().stream().sorted(Entry.
//                      comparingByValue(Comparator.reverseOrder()))
//               .collect(Collectors.toList());
      Map<Integer, String> integerStringMap = new HashMap<>();
      integerStringMap.put(7, "Seven");
      integerStringMap.put(5, "Five");
      integerStringMap.put(1, "One");
               integerStringMap.entrySet()
               .stream()
               .sorted(Map.Entry.comparingByValue())
                       .collect(Collectors.toMap(
                               Map.Entry::getKey,
                               Map.Entry::getValue,
                               (value1, value2) -> value1 + " - " + value2,
                               LinkedHashMap::new
                               )
                       );
//       System.out.println(tempMap);
   }
}
