package org.example.module2.homework3.ex5;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Ruler<Integer> boatMeter = length -> length;
        Ruler<Animal> animalMeter = animal -> animal.getBodyLength() + animal.getTailLength();

        List<Integer> boatLengths = List.of(5, 10, 15);
        List<Animal> animals = List.of(
                new Animal(5, 3),
                new Animal(3, 2),
                new Animal(7, 5)
        );

        List<Integer> measuredBoatLengths = boatLengths.stream().map(boatMeter::measure).toList();
        System.out.println("Измеренные длины лодок: " + measuredBoatLengths);

        List<Integer> measuredAnimalAmounts = animals.stream().map(animalMeter::measure).toList();
        System.out.println("Измеренные суммы длин тела и хвоста у животных: " + measuredAnimalAmounts);
    }
}
