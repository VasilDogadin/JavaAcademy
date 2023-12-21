package org.example.homework4.ex1.objects;

import org.example.homework4.ex1.abstractions.Transport;

public class Bus extends Transport {
    private int maxPassengers;

    public Bus(boolean isClean, double[] dimensions, int maxPassengers) {
        super(isClean, dimensions);
        this.maxPassengers = maxPassengers;
    }

    @Override
    public double tariff(int smallRate, int largeRate) {
        return (getDimensions()[0] > 6 || getDimensions()[1] > 2.5 || getDimensions()[2] > 2) ? largeRate : smallRate;
    }
}
