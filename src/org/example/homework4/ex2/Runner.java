package org.example.homework4.ex2;

import org.example.homework4.ex2.exceptions.FlyException;
import org.example.homework4.ex2.objects.Airplane;
import org.example.homework4.ex2.objects.Duck;

public class Runner {
    public static void main(String[] args) throws FlyException {
        try {
            Duck duck1 = new Duck(false);
            Duck duck2 = new Duck(true);
            duck1.fly();
            duck2.fly();
        } catch (FlyException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        try {
            Airplane airplane1 = new Airplane(10);
            Airplane airplane2 = new Airplane(-1);
            airplane1.fly();
            airplane2.fly();
        } catch (FlyException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
