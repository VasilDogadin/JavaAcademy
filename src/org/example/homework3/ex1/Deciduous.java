package org.example.homework3.ex1;

public class Deciduous extends Tree {
    protected boolean hasLeaves;
    protected boolean canBloom;

    public Deciduous(String name, int age, boolean hasLeaves, boolean canBloom) {
        super(name, age);
        this.hasLeaves = hasLeaves;
        this.canBloom = canBloom;
    }

    public void leavesBloom() {
        if (hasLeaves && canBloom) {
            System.out.println(getName() + " цветёт и выделяет аллергены");
        } else {
            System.out.println(getName() + " уже цвела или нет листьев");
        }
    }
}