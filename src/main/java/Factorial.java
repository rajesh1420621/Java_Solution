import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factFunction.apply(4));
        System.out.println(factFunction.apply(4));
    }

    public static Function<Integer, Integer> factFunction = input -> {
        if (input == 0)
            return 1;
        else
            return IntStream.rangeClosed(1, input)
                    .boxed()
                    .reduce(1, (a, b) -> a * b);
    };

    public static int factMethod(int num){
        int result = 1;
        if (num == 0){
            return result;
        }else {
            for (int i = 0; i < num; i++) {
                result *= i;
            }
            return result;
        }
    }
}
