package org.example.polimorfizm.test;

import org.example.polimorfizm.animal.Animal;
import org.example.polimorfizm.dog.Dog3;

//позднее связывание
public class Test3 {
    public static void main(String[] args) {
        //
        Animal animal = new Dog3();
        //т.к. метод eat() переопределен в class Dog3 то из объекта animal вызывается метод eat() класса Dog3
        animal.eat();
    }
}
