package org.example.homework1;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4();
    }

    public static void ex1() {
        String name = "     ПЕтРова Олег Иванович     ";
        String formattedName = name.trim().toUpperCase(); //убирает пробелы, перевод в верхний регистр

        if (formattedName.contains("ова ".toUpperCase())) { //проверка содержит "ова ", перевод в верхний регистр
            System.out.println("Уважаемая " + formattedName);
        } else if (formattedName.contains("ов ".toUpperCase())) { //проверка содержит "ов ", перевод в верхний регистр
            System.out.println("Уважаемый " + formattedName);
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
                fuel >= 10
                        && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                        && !hasErrors && isEngineWork
        ) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Машина не работает");
        }
    }

    public static void ex3() {
        String simply = "this is simply. This is my favorite song.";
        String replacedSimply = simply.toLowerCase().replaceAll("this is", "those are");
        int indexOfO = replacedSimply.indexOf("o", replacedSimply.indexOf("o") + 1);
        System.out.println(replacedSimply);
        System.out.println("Индекс второй буквы о = " + indexOfO);
    }

    public static void ex4() {
        int sausagePrice = 800;
        int sausageCount = 2000;
        int sausageCost;

        if (sausageCount < 1000) {
            sausageCost = 412;
        } else if (sausageCount >= 1000 && sausageCount < 2000) {
            sausageCost = 408;
        } else {
            sausageCost = 404;
        }

        int hamPrice = 350;
        int hamCost = 275;
        int hamCount = 8511;

        int neckPrice = 500;
        int neckCount = 6988;
        int neckCost = neckCount < 500 ? 311 : 299;

        int income = sausagePrice * sausageCost
                + hamPrice * hamCount
                + neckPrice * neckCount;

        int overheads = 1_000_000;
        int outcome = sausageCost * sausageCount
                + hamCost * hamCount
                + neckCost * neckCount
                + overheads;

        int profitBeforeTaxes = income - outcome;
        double taxBeforeMillion = 0.08;
        double taxBeforeTwoMillion = 0.10;
        double taxAfterTwoMillion = 0.13;
        int firstLimit = 1_000_000;
        int secondLimit = 2_000_000;

        double totalTax;
        if (profitBeforeTaxes <= firstLimit) {
            totalTax = profitBeforeTaxes * taxBeforeMillion;
        } else if (profitBeforeTaxes > firstLimit && profitBeforeTaxes <= secondLimit) {
            double totalTaxBeforeMillion = secondLimit * taxBeforeMillion;
            totalTax = (profitBeforeTaxes - secondLimit) * taxBeforeTwoMillion + totalTaxBeforeMillion;
        } else {
            double totalTaxBeforeMillion = secondLimit * taxBeforeMillion;
            double totalTaxBeforeTwoMillion = (secondLimit - firstLimit - 1) * taxBeforeTwoMillion + taxBeforeMillion;
            totalTax = (profitBeforeTaxes - secondLimit) * taxAfterTwoMillion
                    + totalTaxBeforeMillion + totalTaxBeforeTwoMillion;
        }

        System.out.println("Общая прибыль компании: " + (profitBeforeTaxes - totalTax) + " руб.");
    }
}

