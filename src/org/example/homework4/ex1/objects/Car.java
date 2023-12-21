package org.example.homework4.ex1.objects;

import org.example.homework4.ex1.abstractions.Transport;

public class Car extends Transport {
    private boolean cruiseControl;

    public Car(boolean isClean, double[] dimensions, boolean hasCruiseControl) {
        super(isClean, dimensions);
        this.cruiseControl = hasCruiseControl;
    }

    @Override
    public double tariff(int smallRate, int largeRate) {
        return (getDimensions()[0] > 6 || getDimensions()[1] > 2.5 || getDimensions()[2] > 2) ? largeRate : smallRate;
    }
}
