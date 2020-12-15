package org.example.spring.Example8.bean;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component // stereo annotation
public class Address {

    public Address() {
        System.out.println("address class cont. called "+this.getClass());
    }
    @PostConstruct
    public void init()
    {
        System.out.println("init Address "+this.getClass());
    }
    @PreDestroy
    public void destroy()
    {
        System.out.println("Destroy Address"+this.getClass());
    }
}
