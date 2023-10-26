import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main4thMarch {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 5, 8, 5, 7, 5);
        int noOf5s =
                integerList.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .get(5)
                .intValue();
        int positionOffirst5 = integerList.indexOf(5);
        List<Integer> resultantlist = new ArrayList<>();
        if (positionOffirst5 > 0){
            resultantlist = integerList.stream()
                    .limit(positionOffirst5)
                    .collect(Collectors.toList());
        }
        List<Integer> after5List = integerList.stream()
                .skip(positionOffirst5)
                .filter(i -> i != 5)
                .toList();
        resultantlist.addAll(IntStream.rangeClosed(1, noOf5s).boxed().map(i -> 5).toList());
        resultantlist.addAll(after5List);
        resultantlist.stream().forEach(System.out::println);
    }
}
