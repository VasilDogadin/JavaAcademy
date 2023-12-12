package org.example.homework2.shop;

public class Worker {
    private String name;
    private int age;
    private boolean isMale;
    private Item[] items;

    public Worker(String name, int age, boolean isMale, Item[] items) {
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMale() {
        return isMale;
    }

    public Item[] getItems() {
        return items;
    }

    public void showOffThings() {
        for (Item item : items) {
            System.out.printf("%s: смотрите какая у меня вещь - %s\n", this.name, item.getName());
        }
    }
}
