package org.example.module2.homework2.ex2;

import java.util.HashMap;
import java.util.Map;

public class ItemManager {

    private Map<Item, Integer> itemMap;

    public ItemManager() {
        this.itemMap = new HashMap<>();
    }

    public void addItem(Item item, int value) {
        if (!itemMap.containsKey(item)) {
            itemMap.put(item, value);
        } else {
            throw new RuntimeException("Такая вещь уже существует");
        }
    }

    public int getValue(Item item) {
        if (itemMap.containsKey(item)) {
            return itemMap.get(item);
        } else {
            throw new IllegalArgumentException("Такой вещи нет в списке");
        }
    }
}
