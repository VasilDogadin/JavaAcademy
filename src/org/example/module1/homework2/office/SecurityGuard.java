package org.example.module1.homework2.office;

public class SecurityGuard {
    private String name;

    public SecurityGuard(String name) {
        this.name = name;
    }

    public void askForAdvance() {
        System.out.println("Выдайте мне аванс.");
    }

    public String getName() {
        return name;
    }
}
