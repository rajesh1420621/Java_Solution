import java.time.*;
import java.util.Date;

public class DurationExample {
    public static void main(String[] args) {
//        Instant instant = new Date().toInstant();
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        Instant end = new Date().toInstant();
//        Duration duration = Duration.between(instant, end);
//        System.out.println(duration.toMillis());
        LocalDate currentDate = LocalDate.now();
        LocalDate dateWithoutTime = currentDate;

        System.out.println("Current date: " + currentDate);
        System.out.println("Date without time: " + dateWithoutTime);

        LocalDateTime localDateTime = currentDate.atStartOfDay();
        Date date = Date.from(localDateTime.atZone(ZoneId.systemDefault()).toInstant());

        System.out.println("System date in Date format: " + date);
    }
}
