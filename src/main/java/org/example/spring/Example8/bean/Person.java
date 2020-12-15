package org.example.spring.Example8.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Person {
    public Person() {
        System.out.println("in bean const. excutede "+this.getClass());
    }
    @PostConstruct
    public void init()
    {
        System.out.println("init Person "+this.getClass());
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("Destroy Person"+this.getClass());
    }
}
