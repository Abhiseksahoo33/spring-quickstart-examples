package org.example.spring.Example4.bean;

import org.springframework.stereotype.Component;

@Component("Personbeanexample3") // giving custom name to remove conflict with the annotation among Example 1 , Example 3
public class Person {
    public Person() {
        System.out.println("in bean const. excutede "+this.getClass());
    }
}
