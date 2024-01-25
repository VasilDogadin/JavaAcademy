package org.example.module2.homework1.solution.ex2;

import java.util.ArrayList;
import java.util.List;

public class Runner {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(5, 2, 4);
        List<Integer> list2 = List.of(7, 10);
        ArrayList<Integer> finalList = new ArrayList<>(list1);
        finalList.addAll(list2);
        finalList.remove(2);
        int index = finalList.indexOf(Integer.valueOf(10));
        finalList.indexOf(10);
        System.out.println(index);
    }
}
