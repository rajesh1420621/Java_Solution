import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class GreatestOf3Numbers {


    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

//        System.out.println(
//        Stream.of(a,b,c)
//                .max(Comparator.naturalOrder())
//                .orElse(0));
        if (a > b) {
            if (b > c)
                System.out.println(a);
            else
                System.out.println(c);
        } else {
            if (b > c) {
                System.out.println(b);
            } else {
                System.out.println(c);
            }
        }
    }
}

