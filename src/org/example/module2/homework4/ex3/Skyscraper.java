package org.example.module2.homework4.ex3;

public class Skyscraper {

    private final String name;
    private final int height;

    public Skyscraper(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Skyscraper{" + "name='" + name + ", height=" + height + '}';
    }
}
