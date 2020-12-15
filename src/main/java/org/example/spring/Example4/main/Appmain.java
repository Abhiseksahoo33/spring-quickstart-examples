package org.example.spring.Example4.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Appmain {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext con2 = new AnnotationConfigApplicationContext("org.example.spring.Example4");
String[] beanname = con2.getBeanDefinitionNames() ;
        System.out.println("Bean names "+ Arrays.toString(beanname));
        // scans the package (sub package) of org.spring.example4, to find classes having annotations
    }
}
