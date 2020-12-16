package org.example.spring.Example10.bean;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope
public class Person {
    public Person() {
        System.out.println("in bean const. excutede "+this.getClass());
    }
}
