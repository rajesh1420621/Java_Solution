import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostFrequentChar {

//    2) Most frequent char in String
    public void mostFrequestCharPrint(String str){
        Arrays.stream(str.split(""))
                .filter(c -> !" ".equalsIgnoreCase(c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(1)
                .forEach(System.out::println);
    }
}
