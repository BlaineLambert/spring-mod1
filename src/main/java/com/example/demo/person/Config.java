package com.example.demo.person;

import com.example.demo.person.Person;
import com.example.demo.person.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class Config {
    @Bean
    CommandLineRunner commandLineRunner(PersonRepository pr) {
        return args -> {
            Person blaine = new Person(
                    "Blaine",
                    "Lambert",
                    "6625873850"
            );
            Person AJ = new Person(
                    "AJ",
                    "Gilliland",
                    "9015698542"
            );
            pr.saveAll(
                    List.of(blaine, AJ)
            );
        };
    }
}
