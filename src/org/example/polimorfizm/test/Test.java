package org.example.polimorfizm.test;

import org.example.polimorfizm.animal.Animal;
import org.example.polimorfizm.dog.Dog;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.eat();
        //Объект dog унаследовал (extends) метод eat() из класса public class Animal
        dog.eat();

    }
}
