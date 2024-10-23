package com.prospect.manager;

import com.prospect.manager.model.User;
import com.prospect.manager.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagerApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(UserRepository userRepository) {
        return (args) -> {
            userRepository.save(new User("John", "Doe", "john.doe@example.com"));
            userRepository.save(new User("Jane", "Smith", "jane.smith@example.com"));
        };
    }
}
