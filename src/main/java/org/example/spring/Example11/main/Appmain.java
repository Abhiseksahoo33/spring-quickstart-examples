package org.example.spring.Example11.main;

import org.example.spring.Example11.bean.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appmain {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.example.spring.Example11");

        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.

        Person p = context.getBean(Person.class);
        System.out.println(p);
    }
}
