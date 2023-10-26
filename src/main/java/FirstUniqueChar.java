import java.util.HashMap;

public class FirstUniqueChar {

    public static Character findFirstUniqueChar(String s){
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            hashMap.put(c,hashMap.getOrDefault(c,0) + 1);
        }

        for (int i =0; i<s.length();i++){
            if(hashMap.get(s.charAt(i)) == 1){
                return s.charAt(i);
            }
        }
        return ' ';
    }
    public static void main(String[] args) {
        String str = "leetcodelearn";
        Character chr = findFirstUniqueChar(str);
        System.out.println(chr);

    }
}
