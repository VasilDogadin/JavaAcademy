package org.example.module1.homework4.ex1.abstractions;

public abstract class Transport {
    public boolean isClean;
    private double[] dimensions;

    public Transport(boolean isClean, double[] dimensions) {
        this.isClean = isClean;
        this.dimensions = dimensions;
    }

    public double[] getDimensions() {
        return dimensions;
    }

    public abstract double tariff(int smallRate, int largeRate);
}

