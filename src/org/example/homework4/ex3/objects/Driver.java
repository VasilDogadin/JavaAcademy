package org.example.homework4.ex3.objects;

import org.example.homework4.ex3.interfaces.Sound;

public class Driver implements Sound {
    private Human human;

    public Driver(Human human) {
        this.human = human;
    }

    @Override
    public String makeSound() {
        return "я водитель " + human.makeSound();
    }
}
