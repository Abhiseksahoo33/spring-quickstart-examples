package org.example.spring.Example5.main;

import org.example.spring.Example5.bean.Address;
import org.example.spring.Example5.bean.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Appmain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext con1 = new AnnotationConfigApplicationContext("org.example.spring.Example5");
        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.
        String[] beanNames = con1.getBeanDefinitionNames();

        System.out.println(Arrays.toString(beanNames));

        Address a = con1.getBean("addressbean",Address.class);
        Person p = con1.getBean("personbean",Person.class);
                // con1.getBean("personBean1",Person.class); // NoSuchBeanDefinitionException: No bean named 'personBean1' available

        System.out.println(a.hashCode());
        System.out.println(p.hashCode());

        System.out.println(p.getName());
        System.out.println(p.getAddress());
    }
}
