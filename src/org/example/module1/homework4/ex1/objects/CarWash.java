package org.example.module1.homework4.ex1.objects;

import org.example.module1.homework4.ex1.abstractions.Transport;

public class CarWash {

    void washTransport(Transport transport) {
        transport.isClean = true;
    }

    double tariff(Transport transport, int smallRate, int largeRate) {
        return transport.tariff(smallRate, largeRate);
    }

    double tariff(Car car, int smallRate, int largeRate) {
        return car.tariff(smallRate, largeRate);
    }

    public double calculateCost(Transport[] transports, int smallRate, int largeRate) {
        int totalCost = 0;
        for (Transport transport : transports) {
            washTransport(transport);
            totalCost += tariff(transport, smallRate, largeRate);
        }
        return totalCost;
    }
}
