package org.example.polimorfizm.dog;

import org.example.polimorfizm.animal.Animal;

public class Dog3 extends Animal {
    //метод eat() класса Animal  переопределен в классе Dog3
    @Override
    public void eat(){
        System.out.println("Dog is eating");
    }
    //метод bark() есть только в классе Dog3. Это специфичный (собачий) не родительский метод.
    public void bark(){
        System.out.println("Dog is barking");
    }
}
