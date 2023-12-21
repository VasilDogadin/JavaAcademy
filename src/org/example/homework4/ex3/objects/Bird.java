package org.example.homework4.ex3.objects;

import org.example.homework4.ex3.interfaces.Sound;

public class Bird implements Sound {
    @Override
    public String makeSound() {
        return "чирик";
    }
}
