package org.example.spring.Example6.config;

import org.example.spring.Example6.bean.Address;
import org.example.spring.Example6.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
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
