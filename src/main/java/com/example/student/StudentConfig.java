package com.example.student;

import java.time.LocalDate;
import java.util.*;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

        @SuppressWarnings("null")
        @Bean
        CommandLineRunner commandLineRunner(StudentRepository repository) {
                return args -> {
                        Student Peter = new Student(
                                        "Enotor",
                                        " Epeter2000@yahoo.com",
                                        LocalDate.of(2002, 5, 17));

                        Student Ruth = new Student(
                                        "Omoefe",
                                        " ruth2022@yahoo.com",
                                        LocalDate.of(1967, 8, 17));
                        Student Bright = new Student(
                                        "Ibizugbe", 
                                        " Bpeter1999@yahoo.com",
                                        LocalDate.of(1997, 5, 17));
                        Student David = new Student(
                                        "princewill016",
                                        "p.osaikheigo@yahoo.com",
                                        LocalDate.of(2000, 5, 22));
                        repository.saveAll(
                                        List.of(Peter, Ruth, Bright, David));

                };

        }
}
