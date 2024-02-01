package org.example.module2.homework3.ex4;

public class Runner {

    public static void main(String[] args) {

        Burning<String> atomicReactor = uranium -> System.out.println("Зеленый свет вокруг!");
        Burning<String> bonfire = wood -> System.out.println("Желто-красный свет вокруг!");
        combustion(atomicReactor, "Уран");
        combustion(bonfire, "Дерево");
    }

    private static <T> void combustion(Burning<T> burning, T fuel) {
        burning.burn(fuel);
    }
}
