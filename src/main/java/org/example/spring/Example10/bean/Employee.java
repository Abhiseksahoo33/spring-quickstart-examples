package org.example.spring.Example10.bean;

public class Employee {
    private static final Employee INSTANCE = new Employee();

    private Employee() {

    }

    public static Employee getInstance() {
        return INSTANCE;
    }
}
