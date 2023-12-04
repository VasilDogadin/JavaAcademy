package org.example.homework2.shop;

public class Worker {
    private String name;
    private int age;
    private String gender;
    private Item[] things; //Массив для хранения вещей
    private int thingsCount; // количество вещей

    public Worker(String name, int age, String gender, int maxThings) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.things = new Item[maxThings]; // макс вещей
        this.thingsCount = 0;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Item[] getThings() {
        return things;
    }

    public int getThingsCount() {
        return thingsCount;
    }

    public void addThing(Item item) {
        if (thingsCount < things.length) {
            things[thingsCount++] = item;
        }
    }

    public void showOffThings() {
        for (int i = 0; i < thingsCount; i++) {
            System.out.println(name + ": смотрите какая у меня вещь - " + things[i].getName() + " " +
                    things[i].getWeight() + "гр.");
        }
    }
}
