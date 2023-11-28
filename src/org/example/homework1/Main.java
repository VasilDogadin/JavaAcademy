package org.example.homework1;

public class Main {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
        ex4(2000, 8511, 6988);
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


    public static void ex4(int kgSoldSausage, int kgSoldHam, int kgSoldNeck) {
        int totalIncome = 0;
        int totalExpense = 0;
        int totalSumExpense;

        int priceSausage = 800 * kgSoldSausage;
        int costPriceSausage = (kgSoldSausage < 1000) ? 412 : ((kgSoldSausage < 2000) ? 408 : 404);
        totalIncome += priceSausage;
        totalExpense += costPriceSausage * kgSoldSausage;

        int priceHam = 350 * kgSoldHam;
        int costPriceHam = 275;
        totalIncome += priceHam;
        totalExpense += costPriceHam * kgSoldHam;

        int priceNeck = 500 * kgSoldNeck;
        int costPriceNeck = (kgSoldNeck < 500) ? 311 : 299;
        totalIncome += priceNeck;
        totalExpense += costPriceNeck * kgSoldNeck;

        totalSumExpense = totalExpense + 1_000_000;

        int totalProfitBeforeTaxes = totalIncome - totalSumExpense;

        int totalTax;
        if (totalProfitBeforeTaxes > 2_000_000) {
            totalTax = (int) (totalProfitBeforeTaxes * 0.13);
        } else if ((totalProfitBeforeTaxes > 1_000_000) && (totalProfitBeforeTaxes < 2_000_000)) {
            totalTax = (int) (1_000_000 * 0.08) + (int) ((totalProfitBeforeTaxes - 1_000_000) * 0.10);
        } else {
            totalTax = (int) (totalProfitBeforeTaxes * 0.08);
        }

        System.out.println("Общая прибыль компании: " + totalIncome + " руб.");
        System.out.println("Уплаченные налоги компании: " + totalTax + " руб.");
    }
}

