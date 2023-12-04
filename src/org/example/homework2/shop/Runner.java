package org.example.homework2.shop;

public class Runner {
    public static void main(String[] args) {
        System.out.println("");
        Item hammer = new Item("молот", 1000);
        Item screwdriver = new Item("отвёртка", 50);
        Item notepad = new Item("тетрадь", 30);
        Item pen = new Item("ручка", 10);

        Worker vasily = new Worker("Василий", 30, "муж", 2);
        vasily.addThing(hammer);
        vasily.addThing(screwdriver);

        Worker maryana = new Worker("Марьяна", 25, "жен", 2);
        maryana.addThing(notepad);
        maryana.addThing(pen);

        Shop shop = new Shop(2);
        shop.addEmployee(vasily);
        shop.addEmployee(maryana);
        shop.printEmployees();
        System.out.println("----------------------------------------------------");

        for (int i = 0; i < shop.getEmployeesCount(); i++) {
            Worker employee = shop.getEmployees()[i];
            employee.showOffThings();
        }
    }
}
