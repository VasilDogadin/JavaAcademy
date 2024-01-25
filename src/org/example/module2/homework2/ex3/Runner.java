package org.example.module2.homework2.ex3;

public class Runner {

    public static void main(String[] args) {

        Item item = new Item();

        Detail saw = new Detail("Пила ");
        Detail hammer = new Detail("Молоток ");
        Detail screwdriver = new Detail("Отвёртка ");

        item.addDetail(saw, 1);
        item.addDetail(hammer, 2);
        item.addDetail(screwdriver, 3);

        item.printDetails();
    }
}
