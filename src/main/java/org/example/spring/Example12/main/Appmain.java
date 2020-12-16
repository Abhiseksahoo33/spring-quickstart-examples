package org.example.spring.Example12.main;

import org.example.spring.Example12.bean.Address;
import org.example.spring.Example12.bean.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appmain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.example.spring.Example12");

        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.

        Person p = context.getBean(Person.class);
        System.out.println(p);

        Address a = context.getBean(Address.class);
        System.out.println(a);

        p.setAddress(a);
    }
}
