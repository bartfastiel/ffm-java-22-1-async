package de.neuefische.ffmjava221.async.ffmjava221async;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class FfmJava221AsyncApplication {

    public static void main(String[] args) {
        SpringApplication.run(FfmJava221AsyncApplication.class, args);
    }

}
