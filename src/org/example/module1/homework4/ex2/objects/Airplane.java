package org.example.module1.homework4.ex2.objects;

import org.example.module1.homework4.ex2.exceptions.FlyException;
import org.example.module1.homework4.ex2.interfaces.Flying;

public class Airplane implements Flying {
    private int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    @Override
    public void fly() throws FlyException {
        if (countPassengers <= 0) {
            throw new FlyException("пассажиров в самолете меньше 0");
        } else {
            System.out.println("самолёт летит");
        }
    }
}
