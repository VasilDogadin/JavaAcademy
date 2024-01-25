package org.example.module2.homework2.ex1;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Worker worker1 = new Worker("Работник1");
        Worker worker2 = new Worker("Работник2");
        Worker worker3 = new Worker("Работник3");

        List<Worker> workers = new ArrayList<>();
        workers.add(worker1);
        workers.add(worker2);
        workers.add(worker3);

        LuggageCompartment luggageCompartment = new LuggageCompartment(workers);
        luggageCompartment.airplaneArrival("SU-077");
        luggageCompartment.airplaneArrival("AO-222");

        luggageCompartment.unloadLuggageCompartment();
    }
}
