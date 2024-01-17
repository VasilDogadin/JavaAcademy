package org.example.module2.homework1.ex3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Склад принимает в себя вещи. У склада нет ограничений в хранении.
 */
public class Warehouse {

    private final List<Item> items;

    public Warehouse() {
        this.items = new ArrayList<>();
    }

    //Склад умеет принимать в себя список вещей и хранить их с уже существующими вещами.
    public void addItems(List<Item> newItem) {
        items.addAll(newItem);
    }

    //В складе должен быть метод: получить все вещи.
    //Данный метод вернет список, в котором будет только каждая четная вещь из склада.
    public List<Item> getAllItems() {
        List<Item> evenItems = new ArrayList<>();
        for (int i = 0; i < items.size(); i += 2) {
            evenItems.add(items.get(i));
        }
        return evenItems;
    }

    //В складе должен быть метод: получить вещь по индексу. Данная вещь пропадает из склада.
    public Item getItemByIndex(int index) {
        if (index < 0 || index >= items.size()) {
            System.out.println("Индекс не найден");
        }
        return items.remove(index);
    }

    //Склад умеет удалять все вещи, кроме последней.
    public void removeAllExceptLast() {
        if (items.size() > 1) {
            Iterator<Item> iterator = items.iterator();
            Item lastItem = null;
            while (iterator.hasNext()) {
                lastItem = iterator.next();
            }
            items.clear();
            items.add(lastItem);
        }
    }
}

