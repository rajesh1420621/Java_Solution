import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] num, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<num.length; i++){
            int difference = target - num[i];
            if(map.containsKey(difference)){
                return new int[] {map.get(difference),i};
            }
            map.put(num[i], i);
        }
        return num;
    }

    public static void main(String[] args) {
        int[] data = {2,3,5,6};
        int x = 5;
        for (int i : twoSum(data, x))
        System.out.println(i);
    }

    }

