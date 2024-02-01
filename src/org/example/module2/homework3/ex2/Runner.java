package org.example.module2.homework3.ex2;

import java.util.List;
import java.util.stream.Stream;

public class Runner {

    public static void main(String[] args) {

        Garden appleFarm = () -> {
            List<Apple> apples = Stream.generate(Apple::new)
                    .limit(10)
                    .toList();
            System.out.println(apples);
        };

        Garden apricotFarm = () -> {
            List<Apricot> apricots = Stream.generate(Apricot::new)
                    .limit(10)
                    .toList();
            System.out.println(apricots);
        };

        appleFarm.growFruits();
        apricotFarm.growFruits();
    }
}
