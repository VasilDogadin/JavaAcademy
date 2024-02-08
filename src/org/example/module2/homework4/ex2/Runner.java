package org.example.module2.homework4.ex2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Runner {

    public static void main(String[] args) {

        Set<String> words = new HashSet<>(Arrays.asList("топь", "тополь", "боль", "рой", "стройка"));

        try {
            int sumOfO = words.stream()
                    .mapToInt(Runner::countO)
                    .sum();
            if (sumOfO > 0) {
                System.out.println("Количество букв 'о': " + sumOfO);
            } else {
                throw new RuntimeException("Буква 'о' отсутствует в наборе слов.");
            }
        } catch (RuntimeException e) {
            System.err.println("Ошибка: " + e.getMessage());
        }
    }

    private static int countO(String word) {
        return (int) word.chars()
                .filter(ch -> ch == 'о')
                .count();
    }
}
