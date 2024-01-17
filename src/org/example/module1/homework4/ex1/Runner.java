package org.example.module1.homework4.ex1;

import org.example.module1.homework4.ex1.abstractions.Transport;
import org.example.module1.homework4.ex1.objects.Bus;
import org.example.module1.homework4.ex1.objects.Car;
import org.example.module1.homework4.ex1.objects.CarWash;

public class Runner {
    public static void main(String[] args) {
        CarWash carWash = new CarWash();

        Transport[] dirtyVehicles = {
            new Car(false, new double[]{5, 2, 1.8}, true),
            new Car(false, new double[]{5, 2, 1.8}, true),
            new Car(false, new double[]{5, 2, 1.8}, true),
            new Car(false, new double[]{5, 2, 1.8}, true),

            new Bus(false, new double[]{12, 3, 2.3}, 50),
            new Bus(false, new double[]{12, 3, 2.3}, 50),
            new Bus(false, new double[]{12, 3, 2.3}, 50),
            new Bus(false, new double[]{12, 3, 2.3}, 50),
            new Bus(false, new double[]{12, 3, 2.3}, 50),
        };

        double totalCost = carWash.calculateCost(dirtyVehicles, 2000, 4000);
        System.out.println("Общая стоимость мойки: " + totalCost);
    }
}
