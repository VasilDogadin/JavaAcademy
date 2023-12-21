package org.example.homework3.ex1;

public abstract class Tree { // абстрактный потому что нет конкретной реализации класса
    String name;
    private int age;

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

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
