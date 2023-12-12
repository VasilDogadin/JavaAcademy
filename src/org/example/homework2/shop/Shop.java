package org.example.homework2.shop;

public class Shop {
    private Worker[] workers;

    public Shop(Worker[] workers) {
        this.workers = workers;
    }

    public void printWorkersInfo() {
        for (Worker worker : workers) {
            String gender = worker.isMale() ? "мужчина" : "женщина";
            System.out.printf("%s: %s лет, %s, список вещей: \n%s",
                    worker.getName(), worker.getAge(), gender, Item.getTextItems(worker.getItems()));
        }
    }
}

