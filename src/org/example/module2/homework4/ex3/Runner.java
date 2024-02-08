package org.example.module2.homework4.ex3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {

    public static void main(String[] args) {

        List<Skyscraper> skyscrapers = new ArrayList<>();
        skyscrapers.add(new Skyscraper("Всемирный торговый центр 1", 541));
        skyscrapers.add(new Skyscraper("Шанхайская башня", 632));
        skyscrapers.add(new Skyscraper("Бурдж-Халифа", 828));
        skyscrapers.add(new Skyscraper("Международный финансовый центр Пинань", 599));
        skyscrapers.add(new Skyscraper("Абрадж аль-Бейт", 601));
        skyscrapers.add(new Skyscraper("Всемирный центр Лотте", 555));
        skyscrapers.add(new Skyscraper("Бурдж-Халифа", 828));

        List<Skyscraper> distinctSkyscrapers = skyscrapers.stream()
                .map(Skyscraper::getName)
                .distinct()
                .map(name -> skyscrapers.stream()
                        .filter(skyscraper -> skyscraper.getName().equals(name))
                        .findFirst()
                        .orElse(null))
                .collect(Collectors.toList());
        System.out.println(distinctSkyscrapers);

        List<Skyscraper> firstThreeSkyscrapers = skyscrapers.stream()
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(firstThreeSkyscrapers);

        Skyscraper tallestSkyscraper = skyscrapers.stream()
                .max(Comparator.comparingInt(Skyscraper::getHeight))
                .orElse(null);
        System.out.println(tallestSkyscraper);

        List<Skyscraper> skyscrapersAboveKilometer = skyscrapers.stream()
                .filter(skyscraper -> skyscraper.getHeight() > 1000).toList();

        if (skyscrapersAboveKilometer.isEmpty()) {
            throw new RuntimeException("Небоскреба выше километра нет");
        } else {
            skyscrapersAboveKilometer.forEach(System.out::println);
        }
    }
}
