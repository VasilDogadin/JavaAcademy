package org.example.module2.homework2.ex1;

import java.util.ArrayList;
import java.util.List;

public class LuggageCompartment {

    private List<Suitcase> suitcases;
    private List<Worker> workers;

    public LuggageCompartment(List<Worker> workers) {
        this.suitcases = new ArrayList<>();
        this.workers = workers;
    }

    public void airplaneArrival(String flightNumber) {
        for (int i = 0; i < 20; i++) {
            suitcases.add(new Suitcase(flightNumber));
        }
    }

    public void unloadLuggageCompartment() {
        for (Worker worker : workers) {
            for (Suitcase suitcase : suitcases) {
                worker.throwLuggage(suitcase);
            }
        }
    }
}
