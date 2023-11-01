package me.janggeunyeong.springbootPractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringbootPracticeApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootPracticeApplication.class, args);
    }
}
