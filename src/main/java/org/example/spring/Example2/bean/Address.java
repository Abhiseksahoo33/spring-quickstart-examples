package org.example.spring.Example2.bean;

import org.springframework.stereotype.Component;
@Component // stereo annotation
public class Address {

    public Address() {
        System.out.println("address class cont. called "+this.getClass());
    }
}
