package org.example.module2.homework1.ex1;

public abstract class Animal implements AnimalImpl {

    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void performAction();
}
