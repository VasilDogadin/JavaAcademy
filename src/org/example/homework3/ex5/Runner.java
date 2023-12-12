package org.example.homework3.ex5;

public class Runner {
    public static void main(String[] args) {
        House house1 = new House("Победы", 1);
        House house2 = new House("Московское шоссе", 2);

        House[] houses = {house1, house2};

        City city = new City("Москва", houses);
        System.out.println(city);

        house1 = new House("Новомосковская", house1.getHouseNumber());
        house1.setHouseNumber(22);
        house1.setStreetName("dfdfdfdfd");
        System.out.println(city);
    }
}
