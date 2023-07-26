package com.qa.model;

public class Rabbit extends Animal {


    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Rabit says Hello";
    }

    @Override
    public String move() {
        return "Rabbit is moving";
    }
}
