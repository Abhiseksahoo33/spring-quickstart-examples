package org.example.spring.Example10.main;

import org.example.spring.Example10.bean.Employee;
import org.example.spring.Example10.bean.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Appmain {
    public static void main1(String[] args) {

        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.example.spring.Example10");

        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.

        // prototype scope, need to specify with annotation @Scope
        // each request to context will give you different objects
        Person p = context.getBean(Person.class);
        Person p1 = context.getBean(Person.class);

        System.out.println(p==p1); // true
    }

    public static void singleton(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("org.example.spring.Example10");

        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.

        Person p = context.getBean(Person.class);
        Person p1 = context.getBean(Person.class);

        System.out.println(p == p1); // spring beans are by default singleton


        AnnotationConfigApplicationContext context1 =
                new AnnotationConfigApplicationContext("org.example.spring.Example10");

        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.

        Person p11 = context1.getBean(Person.class);
        Person p12 = context1.getBean(Person.class);

        System.out.println(p11 == p12); //true //  spring beans are by default singleton
        System.out.println(p11 == p1); // false //  spring beans are by default singleton in a context only. not across the contexts.


    }

    public static void main(String[] args) {


        // Employee is a singleton class
        Employee e = Employee.getInstance();
        Employee e1 = Employee.getInstance();

        System.out.println(e == e1); // true

    }
}
