package org.example.module1.homework3.ex2.components;

public class OperationalSystem {
    private String name;

    public OperationalSystem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OperationalSystem{" +
                "name='" + name + '\'' +
                '}';
    }
}
