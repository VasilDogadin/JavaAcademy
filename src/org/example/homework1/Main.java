package org.example.homework1;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();

        ex4("Колбаса", 2000);
        ex4("Ветчина", 8511);
        ex4("Шейка", 6988);
    }

    public static void ex1() {
        String name = "     ПЕтРова Олег Иванович     ";

        if (name.contains("ова")) {
            System.out.println("Уважаемая " + name.trim().toUpperCase());
        } else if (name.contains("ов")) {
            System.out.println("Уважаемый " + name.trim().toUpperCase());
        } else {
            System.out.println("Не известное лицо");
        }
    }

    public static void ex2() {
        double fuel = 10;
        boolean isEngineWork = true;
        boolean hasErrors = false;
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        if (
                !(fuel < 10)
                        && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                        && !(hasErrors) && (isEngineWork)
        ) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Машина не работает");
        }
    }

    public static void ex3() {
        String simply = "this is simply. This is my favorite song.".toLowerCase()
                .replaceAll("this is", "those are");
        System.out.println(simply);
        System.out.println("Индекс второй буквы о в строке = " + simply.indexOf('o', 3));
    }

    public static void ex4(String productName, int kgSold) {
        int price;
        int costPrice;

        if ("Колбаса".equals(productName)) {
            price = 800;
            costPrice = (kgSold < 1000) ? 412 : ((kgSold < 2000) ? 408 : 404);
        } else if ("Ветчина".equals(productName)) {
            price = 350;
            costPrice = 275;
        } else if ("Шейка".equals(productName)) {
            price = 500;
            costPrice = (kgSold < 500) ? 311 : 299;
        } else {
            System.out.println("Товар не найден");
            return;
        }

        int income = price * kgSold;
        int expenses = (costPrice * kgSold) + 1_000_000;
        int profitBeforeTaxes = income - expenses;
        int tax;

        if (profitBeforeTaxes > 2_000_000) {
            tax = (int) (profitBeforeTaxes * 0.13);
        } else if ((profitBeforeTaxes > 1_000_000) && (profitBeforeTaxes < 2_000_000)) {
            tax = (int) (profitBeforeTaxes * 0.10);
        } else {
            tax = (int) (profitBeforeTaxes * 0.8);
        }

        int profitAfterTaxes = profitBeforeTaxes - tax;

        System.out.println("Товар: " + productName);
        System.out.println("Прибыль после налогов: " + profitAfterTaxes + " руб.");
        System.out.println("**********************************");
    }
}