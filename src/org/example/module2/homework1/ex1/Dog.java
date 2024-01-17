package org.example.module2.homework1.ex1;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " - даёт хозяину лапу.");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " - умеет лаять");
    }
}
