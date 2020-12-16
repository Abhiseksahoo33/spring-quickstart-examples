package org.example.spring.Example10.bean;

import org.springframework.stereotype.Component;

@Component // stereo annotation
public class Address {
    public Address() {
        System.out.println("Address class bean cont. call "+this.getClass());
    }
}
