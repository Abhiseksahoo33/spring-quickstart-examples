package org.example.spring.Example3.main;

import org.example.spring.Example3.bean.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appmain {
    public static void main(String[] args) {

        String[] basepackage = {"org.example.spring.Example3","org.example.spring.Example2"};
        AnnotationConfigApplicationContext con2 = new AnnotationConfigApplicationContext(basepackage);


    }
}
