package org.example.homework2.shop;

public class Item {
    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public static String getTextItems(Item[] items) {
        String text = "";
        for (Item item : items) {
            text += String.format("имя вещи: %S, вес вещи: %s\n", item.getName(), item.getWeight());
        }
        return text;
    }
}
