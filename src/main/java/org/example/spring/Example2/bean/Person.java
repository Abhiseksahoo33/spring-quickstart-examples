package org.example.spring.Example2.bean;

import org.springframework.stereotype.Component;

@Component
public class Person {
    public Person() {
        System.out.println("in bean const. excutede "+this.getClass());
    }
}
