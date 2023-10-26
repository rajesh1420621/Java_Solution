import java.util.AbstractMap;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main27thOct20230023 {
    public static void main(String[] args) {
//        Given a String, find the first repeated character in it using Stream API and print the character the repeated number of times?
        String s = "Hello world";
        Map.Entry<String, Long> entry = Stream.of(s.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() > 1)
                .findFirst()
                .orElse(new AbstractMap.SimpleEntry<>("Empty", 0L)); // This stream will get all the repeated characters in a string in ordered fashion.

        IntStream.rangeClosed(0, Math.toIntExact(entry.getValue()))
                .boxed()
                .filter(i -> i > 0)
                .forEach(i -> System.out.print(entry.getKey())); // This stream will print the letters repeated number of times.
    }
}
