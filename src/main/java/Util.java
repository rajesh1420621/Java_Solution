import com.github.javafaker.Faker;

import java.util.function.Consumer;
import java.util.function.Function;

public class Util {
    private static final Faker FAKER = Faker.instance();

    public static Consumer<String> onNextConsumer1 = System.out::println;
    public static Function<String, Consumer<String>> onNextConsumer = s -> {
//        System.out::println;
        System.out.println(s);
        return null;
    };
    public static Function<String, Consumer<String>> onErrorConsumer = s -> System.out::println;
    public static Runnable onComplete = () -> System.out.println("Completed");
    public static Faker getFaker(){
        return FAKER;
    }
}
