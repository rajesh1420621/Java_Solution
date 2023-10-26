import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean duplicateCheck(int [] num){
        HashSet<Integer> hashSet = new HashSet<Integer>();
           for(int i : num){
               if(hashSet.contains(i)){
                   return true;
               }else{
                   hashSet.add(i);
               }
           }
           return false;
    }
    public static void main(String[] args) {
        int[] num = {1, 4, 6, 7, 3, 5};
        boolean j = duplicateCheck(num);
        System.out.println(j);
    }
}
