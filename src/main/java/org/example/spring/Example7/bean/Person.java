package org.example.spring.Example7.bean;


public class Person {
    private  String name;
    private Address address;
    public Person() {
        name = "Abhisek";
        System.out.println("in bean const. execute "+this.getClass());

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
