package com.qa.model;

public class Cat extends Animal {


    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Cat says Hello";
    }

    @Override
    public String move() {
        return "Cat is moving";
    }

}
