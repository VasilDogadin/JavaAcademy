package org.example.homework3.ex5;

import java.util.Arrays;

public final class City {
    private final String cityName;
    private final House[] houses;

    public City(String cityName, House[] houses) {
        this.cityName = cityName;
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "Город: " + cityName + Arrays.toString(houses);
    }
}
