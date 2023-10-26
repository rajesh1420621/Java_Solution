import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
//    1) Check if a number is palindrome...also, print all palindrome numbers in an array
//        Palindrome palindrome = new Palindrome();
//        System.out.println(palindrome.isPalindrome(12321));
//        palindrome.palindromeNumbersInAnArray(new int[]{121, 123, 11, 45, 676, 23});

//    2) Most frequent char in String
//        MostFrequentChar mostFrequentChar = new MostFrequentChar();
//        mostFrequentChar.mostFrequestCharPrint("The quick brown fox jumps over the lazy dog");

//    3) Add 2 BIG numbers...think of adding of large numbers, overflow condition etc
//        BigNumbersAdd bigNumbersAdd = new BigNumbersAdd();
//        System.out.println(bigNumbersAdd.add(new BigInteger("123456789987654321"), new BigInteger("123456789987654321")));
//

//        4) Largest common prefix of strings
//        String[] words = new String[]{"Apple","Application","Applicable","App", "A"};
//        LargestCommonPrefixString largestCommonPrefixString = new LargestCommonPrefixString();
//        String prefix = largestCommonPrefixString.getPrefix(words);
//        System.out.println(prefix);

//        5) Sort map by values
        SortMapValues sortMapValues = new SortMapValues();
        Map<Integer, String> map = new HashMap<>();
        map.put(23, "Supriya");
        map.put(45, "Alexa");
        map.put(25, "Sheree");
        map.put(34, "Google");
        sortMapValues.sortByValue(map);

// Given an array of integer numbers and an integer target, return indices of the two numbers such that they add up to the target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.
// Constraints: Only one valid answer exists.
//        int[] intArray = new int[]{10,15,23,80,75,67,25};
//        IndicesOfNumbersinAnArray indicesOfNumbersinAnArray = new IndicesOfNumbersinAnArray();
//        indicesOfNumbersinAnArray.getindices(intArray, 90);

//    Given a string s containing just the characters '(', ')', '{', '}',
//            '[' and ']', determine if the input string is valid.
//    An input string is valid if:
//    Open brackets must be closed by the same type of brackets.
//    Open brackets must be closed in the correct order.
//    Every close bracket has a corresponding open bracket of the same type.
//        ValidBrackets validBrackets = new ValidBrackets();
//        System.out.println("Is valid? " + validBrackets.isValid("[{()}"));

//        Can you write a name that turns input into a numero name?
//        NumeroName numeroName = new NumeroName();
//        System.out.println(numeroName.convertName("Kubernetes"));
    }
}
