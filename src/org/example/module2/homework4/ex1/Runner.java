package org.example.module2.homework4.ex1;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Runner {

    public static void main(String[] args) {

        List<Car> numsA = Stream.iterate(1, i -> i + 1)
                .limit(50)
                .map(i -> new Car("a0" + String.format("%02d", i) + "ан799")).toList();

        List<Car> numsK = Stream.iterate(1, i -> i + 1)
                .limit(50)
                .map(i -> new Car("k0" + String.format("%02d", i) + "се178")).toList();

        List<Car> allCars = Stream.concat(numsA.stream(), numsK.stream()).toList();

        List<String> specialCarNumbers = allCars.stream()
                .map(Car::getRegistrationNumber)
                .filter(registrationNumber -> registrationNumber.matches("[a-k]04\\dан799|[a-k]04\\dсе178"))
                .collect(Collectors.toList());

        String result = String.join(", ", specialCarNumbers);
        System.out.println(result);
    }
}
