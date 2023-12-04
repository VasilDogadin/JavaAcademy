package org.example.homework2.shop;

public class Shop {
    private Worker[] employees;
    private int employeesCount;

    public Shop(int maxEmployees) {
        this.employees = new Worker[maxEmployees];
        this.employeesCount = 0;
    }

    public void addEmployee(Worker employee) {
        if (employeesCount < employees.length) {
            employees[employeesCount++] = employee;
        }
    }

    public void printEmployees() {
        for (int i = 0; i < employeesCount; i++) {
            Worker employee = employees[i];
            System.out.print(employee.getName() + ": " + employee.getAge() + " лет, " + employee.getGender() +
                    ", список вещей: (");

            Item[] things = employee.getThings();
            for (int j = 0; j < employee.getThingsCount(); j++) {
                System.out.print(things[j].getName());
                if (j < employee.getThingsCount() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println(")");
        }
    }

    public int getEmployeesCount() {
        return employeesCount;
    }

    public Worker[] getEmployees() {
        return employees;
    }
}

