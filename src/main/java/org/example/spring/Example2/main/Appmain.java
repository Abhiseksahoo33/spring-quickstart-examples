package org.example.spring.Example2.main;

import org.example.spring.Example2.bean.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appmain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext con1 = new AnnotationConfigApplicationContext("org.example.spring.Example2");
        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.
    }
}
