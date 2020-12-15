package org.example.spring.Example7.config;

import org.example.spring.Example7.bean.Address;
import org.example.spring.Example7.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.example.spring.Example7","org.example.spring.Example6"})
public class Appconfig {
    @Bean("Beanperson") // to make the return type as spring bean
    public Person getPerson() {
        return new Person();
    }

    @Bean
    public Address getAddress() {
        return new Address();
    }
}
