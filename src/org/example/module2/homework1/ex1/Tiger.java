package org.example.module2.homework1.ex1;

public class Tiger extends Animal {

    public Tiger(String name) {
        super(name);
    }

    @Override
    public void performAction() {
        System.out.println(getName() + " - слушается дрессировщика");
    }

    @Override
    public void makeSound() {
        System.out.println(getName() + " - умеет рычать");
    }
}
