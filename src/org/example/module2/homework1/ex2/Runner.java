package org.example.module2.homework1.ex2;

import java.util.ArrayList;

public class Runner {

    public static void main(String[] args) {

        ArrayList<Integer> firstList = new ArrayList<>();
        firstList.add(5);
        firstList.add(2);
        firstList.add(4);

        ArrayList<Integer> secondList = new ArrayList<>();
        secondList.add(7);
        secondList.add(10);
        firstList.addAll(secondList);

        ArrayList<Integer> finalList = new ArrayList<>(firstList);
        finalList.remove(Integer.valueOf(4));
        System.out.println(finalList);
        System.out.println(finalList.indexOf(10));
    }
}
