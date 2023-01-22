import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LargestCommonPrefixString {

//    4) Largest common prefix of strings
    public String getPrefix(String[] words){
        List<String> sortedWords = Arrays.stream(words).sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        String prefix = sortedWords.get(0);
        for (String word : sortedWords){
            while(word.indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() -1);

            }
        }
        if(!prefix.equals("")){
            return prefix;
        }
        return "";
    }
}
