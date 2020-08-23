package org.example.polimorfizm.test;

import org.example.polimorfizm.animal.Animal;
import org.example.polimorfizm.cat.Cat4;
import org.example.polimorfizm.dog.Dog4;

public class Test4 {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog4 dog4 = new Dog4();
        Cat4 cat4 = new Cat4();

        //полиморфизм позволяет передавать в метод test4(Animal animal) разные типы
        //вызов метода test4(Animal animal) на объекто класса class Animal
        test4(animal);
        //вызов метода test4(Animal animal) на объекто класса class Dog4
        //у объекта класса class Dog4 выводится переопределенный метод eat() из класса class Dog4
        //т.к. в классе class Dog4 есть свой метод eat()
        test4(dog4);
        //вызов метода test4(Animal animal) на объекто класса class Cat4
        //у объекта класса class Cat4 выводится родительский метод eat() из класса class Animal
        //т.к. в классе class Cat4 нет своего метода eat()
        test4(cat4);

    }

    //полиморфизм позволяет передавать в метод test4(Animal animal) разные типы
    public static void test4(Animal animal){
        animal.eat();

    }
}
