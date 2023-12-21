package org.example.homework3.ex1;

/**
 * Хвойные
 */
public abstract class Conifer extends Tree {
    private final String needleType;

    public Conifer(String name, int age, String needleType) {
        super(name, age);
        this.needleType = needleType;
    }

    public String getNeedleType() {
        return needleType;
    }
}
