package com.qa.model;

public class Dog extends Animal {


    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Dog says Hello";
    }

    @Override
    public String move() {
        return "Dog is moving";
    }
}
