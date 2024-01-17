package org.example.module2.homework1.ex3;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();

        List<Item> initialItems = List.of(
                new Item("Книга"),
                new Item("Лампа"),
                new Item("Компьютер"),
                new Item("Принтер"),
                new Item("Стол"),
                new Item("Стул")
        );

        warehouse.addItems(initialItems);
        System.out.println(warehouse.getAllItems());

        Item removedItem = warehouse.getItemByIndex(2);
        System.out.println(removedItem.getName());
        System.out.println(warehouse.getAllItems());

        warehouse.removeAllExceptLast();
        System.out.println(warehouse.getAllItems());
    }
}


