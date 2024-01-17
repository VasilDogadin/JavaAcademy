package org.example.module1.homework3.ex1;

/**
 * Лиственные
 */
public abstract class Deciduous extends Tree {
    private boolean hasLeaves = true; // есть листья

    public Deciduous(String name, int age) {
        super(name, age);
    }

    // листья опадают
    public void fallLeaves() {
        this.hasLeaves = false;
    }

    // листья цветут
    public void bloom() {
        this.hasLeaves = true;
    }
}