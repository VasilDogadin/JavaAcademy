package org.example.module2.homework1.ex1;

import java.util.ArrayList;

public class Zoo<T extends Animal> {

    private final ArrayList<T> animals;

    public Zoo() {
        this.animals = new ArrayList<>();
    }

    public void addAnimal(T animal) {
        animals.add(animal);
    }

    public T getAnimal(int index) throws AnimalIndexNotFoundException {
        if (index >= 0 && index < animals.size()) {
            return animals.get(index);
        } else {
            throw new AnimalIndexNotFoundException("индекс животного не найден!");
        }
    }

    public void performActions() {
        for (T animal : animals) {
            animal.performAction();
        }
    }

    public void makeSounds() {
        for (T animal : animals) {
            animal.makeSound();
        }
    }
}
