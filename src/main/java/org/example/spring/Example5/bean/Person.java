package org.example.spring.Example5.bean;

import org.springframework.stereotype.Component;

@Component("personbean")
public class Person {
    private  String name;
    private  Address address;
    public Person() {
        name = "Abhisek";
        System.out.println("in bean const. excutede "+this.getClass());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
