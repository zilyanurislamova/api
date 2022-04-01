package com.example.api.students;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfiguration {
    @Bean
    public CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            studentRepository.saveAll(List.of(
                    new Student("Zilya", "zilya@mail.ru", LocalDate.of(1994, Month.JUNE, 7)),
                    new Student("Kolya", "kolya@mail.ru", LocalDate.of(1995, Month.MAY, 22))
            ));
        };
    }
}
