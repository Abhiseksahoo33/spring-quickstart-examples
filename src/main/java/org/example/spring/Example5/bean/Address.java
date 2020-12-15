package org.example.spring.Example5.bean;

import org.springframework.stereotype.Component;

@Component("addressbean")// stereo annotation
public class Address {

    public Address() {
        System.out.println("address class cont. called "+this.getClass());
    }
}
