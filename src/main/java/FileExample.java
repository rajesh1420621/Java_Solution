import com.github.javafaker.Faker;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;

public class FileExample {
    final static Path path = Paths.get("src/main/resources");
    public static void main(String[] args) {
        deleteFile("file1.txt");
//        createFile("file1.txt");
//        writeFile("file1.txt", "Writing string content using nio files library");
//        readFile("file1.txt")
//                .subscribe(System.out::println);
    }

    public static void createFile(String name){
        try {
            Files.createFile(path.resolve(name));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeFile(String name, String content){
        try {
            Files.writeString(path.resolve(name), content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Mono<String> readFile(String name){
        return Mono.fromSupplier(() -> {
            try {
                return Files.readString(path.resolve(name));
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }

    public static void deleteFile(String name){
        try {
            Files.deleteIfExists(path.resolve(name));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
