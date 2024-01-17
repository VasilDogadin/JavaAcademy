package org.example.module1.homework3.ex1;

public class Birch extends Deciduous {
    public Birch(String name, int age) {
        super(name, age);
    }

    @Override
    public void bloom() {
        super.bloom();
        System.out.println("Берёза цветёт");
    }
}
