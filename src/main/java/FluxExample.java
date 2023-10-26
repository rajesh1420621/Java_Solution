import com.github.javafaker.Faker;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FluxExample {
    public static void main(String[] args) throws InterruptedException {
        getNames(15)
                .subscribe(s -> Util.onNextConsumer1.accept(s),
                        e -> Util.onErrorConsumer.apply(e.getMessage()),
                        Util.onComplete);
        Thread.sleep(15000);
    }

    public static Flux<String> getNames(int n){
        return Flux.range(1, n)
                .map(i -> Util.getFaker().name().fullName().concat(", ").concat(Util.getFaker().address().fullAddress()))
                .delayElements(Duration.ofSeconds(1));
    }
}
