import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DiamondProblem {
    public static void main(String[] args) {
        diamond.apply(20)
                .stream()
                .forEach(System.out::println);
    }

    public static Function<Integer, String> getAsterisks = num -> {
      return IntStream.rangeClosed(1, num)
              .boxed()
              .map(i -> "*")
              .reduce("", (a, b) -> a + b);
    };
    public static Function<Integer, String> getSpaces = num -> {
//        System.out.println(num);
        return IntStream.rangeClosed(1, num)
                .boxed()
                .map(i -> " ")
                .reduce("", (a, b) -> a + b);
    };
    public static Function<Integer, List<String>> diamond = integer -> {
      return IntStream.rangeClosed(1, integer)
              .boxed()
              .map(i -> getSpaces.apply((integer - i) / 2) + getAsterisks.apply(i))
              .collect(Collectors.toList());
    };
}
