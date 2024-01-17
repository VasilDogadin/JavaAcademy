package org.example.module2.homework1.ex1;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " - умеет летать");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " - чирикает");
    }
}
