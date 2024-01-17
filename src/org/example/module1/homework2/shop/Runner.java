package org.example.module1.homework2.shop;

public class Runner {
    @SuppressWarnings("checkstyle:Indentation")
    public static void main(String[] args) {
        Item[] vasilyItems = {
                new Item("молот", 1000),
                new Item("отвёртка", 50)
        };
        Item[] marianaItems = {
                new Item("тетрадь", 30),
                new Item("ручка", 10),
        };
        Worker[] workers = {
                new Worker("Василий", 30, true, vasilyItems),
                new Worker("Марьяна", 25, false, marianaItems)
        };
        Shop shop = new Shop(workers);
        shop.printWorkersInfo();
        System.out.println("------------------------------------------------");
        for (Worker worker : workers) {
            worker.showOffThings();
        }
    }
}