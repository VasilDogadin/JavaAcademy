package org.example.module1.homework3.ex5;

public class Runner {
    public static void main(String[] args) {
        House[] houses = {
            new House("Ленина", 1),
            new House("Победы", 2)
        };

        City moscow = new City("Москва", houses);
        moscow.getHouses()[0].setHouseNumber(11);
        System.out.println(moscow);
    }
}
