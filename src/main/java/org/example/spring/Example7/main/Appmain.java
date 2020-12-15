package org.example.spring.Example7.main;

import org.example.spring.Example7.bean.Address;
import org.example.spring.Example7.bean.Person;
import org.example.spring.Example7.config.Appconfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Appmain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext con1 = new AnnotationConfigApplicationContext(Appconfig.class);
        // specifying the package(s) where you have declared your classes as bean.
        // only those beans or objects will be created.
        String[] beanNames = con1.getBeanDefinitionNames();

        System.out.println(Arrays.toString(beanNames));

        Address a = con1.getBean( Address.class);
        Person p = con1.getBean("Beanperson", Person.class);
                // con1.getBean("personBean1",Person.class); // NoSuchBeanDefinitionException: No bean named 'personBean1' available

        System.out.println(a.hashCode());
        System.out.println(p.hashCode());

        System.out.println(p.getName());
        System.out.println(p.getAddress());
    }
}
