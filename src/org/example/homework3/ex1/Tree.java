package org.example.homework3.ex1;

public abstract class Tree {
    String name;
    protected int age;

    public Tree(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
