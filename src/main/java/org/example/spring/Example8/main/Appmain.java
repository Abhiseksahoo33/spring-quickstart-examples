package org.example.spring.Example8.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Appmain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext con1 = new AnnotationConfigApplicationContext("org.example.spring.Example2");
        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.
    con1.registerShutdownHook();  // this will terminate the bean context gracefully. @PreDestroy callbacks will execute
    }
}
