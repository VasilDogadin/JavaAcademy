package org.example.module1.homework2.office;

public class Runner {
    public static void main(String[] args) {
        Boss boss = new Boss("Пётр Николаевич");
        Manager manager = new Manager("Володя");
        Secretary secretary = new Secretary();
        SecurityGuard security = new SecurityGuard("Петрович");

        Office office = new Office(boss, manager, secretary, security);
        office.startWorkingDay();
    }
}
