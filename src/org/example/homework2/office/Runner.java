package org.example.homework2.office;

public class Runner {
    public static void main(String[] args) {
        Boss boss = new Boss("Пётр Николаевич");
        Manager manager = new Manager("Володя");
        Secretary secretary = new Secretary();
        SecurityGuard securityGuard = new SecurityGuard("Петрович");

        Office office = new Office(boss, manager, secretary, securityGuard);
        office.startWorkingDay();
    }
}
