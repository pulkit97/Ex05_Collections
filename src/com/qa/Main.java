package com.qa;

import com.qa.model.*;
import com.sun.source.tree.LiteralTree;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Ex 5.2
        Cat c1 = new Cat("Luka", 6);
        Dog d1 = new Dog("Bruno", 9);
        Dog d2 = new Dog("Minni", 2);
        Rabbit r1 = new Rabbit("Hopper", 12);
        Rabbit r2 = new Rabbit("Bugs Bunny", 4);

        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(c1);
        animals.add(d1);
        animals.add(d2);
        animals.add(r1);
        animals.add(r2);

        //Using for loop
        for (int i=0; i<animals.size(); i++){
            System.out.println(animals.get(i));
        }

        //Using while iterator
        Iterator<Animal> iter = animals.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

        //Using for each
        for (Animal a: animals){
            System.out.println(a);
        }

        HashMap<String, Animal> animalMap = new HashMap<String, Animal>();

        animalMap.put(c1.getName(), c1);
        animalMap.put(d1.getName(), d1);
        animalMap.put(d2.getName(), d2);
        animalMap.put(r1.getName(), r1);
        animalMap.put(r2.getName(), r2);

        HashMap<Animal, String> animalMap2 = new HashMap<>();

        animalMap2.put(c1, "Fluffy");
        animalMap2.put(d1, "Something more");
        animalMap2.put(d2, "Something different");
        animalMap2.put(r1, "Some random words");
        animalMap2.put(r2, "Random words again");

        for (String key: animalMap.keySet()) {
            System.out.println("Key: " + key + " Value: " + animalMap.get(key));
        }

        HashSet<Animal> set = new HashSet<>();
        set.addAll(animals);

        set.add(c1);

        Iterator<Animal> iter3 = set.iterator();
        while(iter3.hasNext()){
            System.out.println(iter3.next());
        }


        //Ex 5.3

        Collections.sort(animals);
        for (int i=0; i<animals.size(); i++){
            System.out.println(animals.get(i));
        }

    }
}