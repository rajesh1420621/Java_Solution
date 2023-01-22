import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Palindrome {
//    1) Check if a number is palindrome...also, print all palindrome numbers in an array
    public boolean isPalindrome(int number){
        List<String> digits = Arrays.stream(String.valueOf(number).split("")).collect(Collectors.toList());
        Collections.reverse(digits);
        int reversedNumber = Integer.parseInt(String.join("", digits));
        return number == reversedNumber;
    }

    public void palindromeNumbersInAnArray(int[] numberArray){
        Arrays.stream(numberArray)
                .filter(this::isPalindrome)
                .forEach(System.out::println);
    }
}
