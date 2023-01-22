import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapValues {

//    5) Sort map by values
   public void sortByValue(Map<Integer, String> integerStringMap){
       Map<Integer, String> tempMap =
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
       System.out.println(tempMap);
   }
}
