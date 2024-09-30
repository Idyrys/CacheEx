package kg.bakai.cacheex30_09_2024.model;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Component
public class Dao {
    @SneakyThrows
    public String getData(String lastName){
        Thread.sleep(10000);
       List<String> strings = Files.readAllLines(Path.of("C:\\Users\\Asus\\IdeaProjects\\cacheEx30_09_2024\\src\\main\\resources\\"+lastName+".txt"));

        return String.join("",strings);
    }
}
