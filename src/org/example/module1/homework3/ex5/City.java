package org.example.module1.homework3.ex5;

import java.util.Arrays;

public final class City {
    private final String cityName;
    private final House[] houses;

    public City(String cityName, House[] houses) {
        this.cityName = cityName;
        this.houses = houses;
    }

    public String getCityName() {
        return cityName;
    }

    public House[] getHouses() {
        House[] housesClone = new House[houses.length];
        for (int i = 0; i < houses.length; i++) {
            housesClone[i] = new House(houses[i].getStreetName(), houses[i].getHouseNumber());
        }
        return housesClone;
    }

    @Override
    public String toString() {
        return "Город: " + cityName + Arrays.toString(houses);
    }
}
