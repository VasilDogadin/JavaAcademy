package org.example.homework3.ex1;

public class Conifer extends Tree {
    protected String needleType;

    public Conifer(String name, int age, String needleType) {
        super(name, age);
        this.needleType = needleType;
    }

    public String getNeedleType() {
        return needleType;
    }
}
