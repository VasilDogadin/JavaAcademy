package org.example.module2.homework2.solution.ex1;

import java.util.Queue;

public class Worker {

    private String name;

    public Worker(String name) {
        this.name = name;
    }

    public void unload(Queue<Luggage> luggages) {
        if (!luggages.isEmpty()) {
            System.out.printf("%s: Мужики, кидаю чемодан %s\n", name, luggages.poll().getFlightNumber());
        }
    }
}
