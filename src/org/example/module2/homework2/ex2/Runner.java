package org.example.module2.homework2.ex2;

public class Runner {

    public static void main(String[] args) {

        ItemManager itemManager = new ItemManager();

        Item apple = new Item("Яблоко");
        Item banana = new Item("Банан");
        Item orange = new Item("Апельсин");

        itemManager.addItem(apple, 1);
        itemManager.addItem(banana, 2);
        itemManager.addItem(orange, 3);

        System.out.println(itemManager.getValue(orange));
    }
}
