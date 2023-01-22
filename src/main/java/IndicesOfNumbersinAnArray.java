import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class IndicesOfNumbersinAnArray {

// Given an array of integer numbers and an integer target, return indices of the two numbers such that they add up to the target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// Constraints: Only one valid answer exists.

    public void getindices(int[] intArray, int target){
        List<Integer> intList =
                Arrays.stream(intArray)
                        .boxed()
                        .collect(Collectors.toList());
        intList.stream()
                .map(i -> {
                    Map<Integer, Integer> map = new HashMap<>();
                    intList.stream()
                            .filter(j -> i + j == target)
                            .collect(Collectors.toList())
                            .stream()
                            .collect(Collectors.mapping(k -> map.put(i, k), Collectors.toList()));
                    return map;
                })
                .forEach(m -> m.forEach((k,v) -> System.out.println("(" + intList.indexOf(k) + ", " + intList.indexOf(v) + ")")));
    }
}
