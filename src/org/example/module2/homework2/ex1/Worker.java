package org.example.module2.homework2.ex1;

public class Worker {

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void throwLuggage(Suitcase suitcase) {
        System.out.println(name + ": Мужики, кидаю чемодан " + suitcase.getFlightNumber());
    }

    public String getName() {
        return name;
    }
}
