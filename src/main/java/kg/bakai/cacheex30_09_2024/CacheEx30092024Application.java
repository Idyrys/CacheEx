package kg.bakai.cacheex30_09_2024;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class CacheEx30092024Application {

    public static void main(String[] args) {
        SpringApplication.run(CacheEx30092024Application.class, args);
    }

}
