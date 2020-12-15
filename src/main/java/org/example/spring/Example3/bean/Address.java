package org.example.spring.Example3.bean;

import org.springframework.stereotype.Component;

@Component("Addressbeanexample3") // stereo annotation
public class Address {
    public Address() {
        System.out.println("Address class bean cont. call "+this.getClass());
    }
}
