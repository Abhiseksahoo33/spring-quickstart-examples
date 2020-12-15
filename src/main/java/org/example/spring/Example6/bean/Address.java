package org.example.spring.Example6.bean;

import org.springframework.stereotype.Component;


public class Address {

    public Address() {
        System.out.println("address class cont. called "+this.getClass());
    }
}
