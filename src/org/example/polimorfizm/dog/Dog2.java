package org.example.polimorfizm.dog;

import org.example.polimorfizm.animal.Animal;

public class Dog2 extends Animal {
    //метод bark() есть только в классе Dog2. Это специфичный (собачий) не родительский метод.
    public void bark(){
        System.out.println("Dog is barking");
    }
}
