package org.example.homework4.ex3;

import org.example.homework4.ex3.interfaces.Sound;
import org.example.homework4.ex3.objects.Bird;
import org.example.homework4.ex3.objects.Builder;
import org.example.homework4.ex3.objects.Driver;
import org.example.homework4.ex3.objects.Human;

public class Runner {
    public static void main(String[] args) {
        Sound human = new Human();
        Sound builder = new Builder();
        Sound driver = new Driver(new Human());
        Sound bird = new Bird();

        Sound[] sounds = {
            human, builder,
            driver, bird
        };

        for (Sound sound : sounds) {
            System.out.println(sound.makeSound());
        }
    }
}
