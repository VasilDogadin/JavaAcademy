package org.example.module2.homework3.ex1;

import java.time.LocalDateTime;
import java.util.*;

public class Runner {

    public static void main(String[] args) {

        Comparator<Review> reviewComparator = (r1, r2) ->
                r1.getLikes() != r2.getLikes() ? Integer.compare(r2.getLikes(), r1.getLikes()) :
                        r2.getDateTime().compareTo(r1.getDateTime());

        Set<Review> sortedReviews = new TreeSet<>(reviewComparator);

        sortedReviews.add(new Review(3, "Плохой товар", 100, LocalDateTime.of(2024, 1, 25, 13, 37)));
        sortedReviews.add(new Review(1, "Отличный товар", 200, LocalDateTime.of(2024, 1, 25, 17, 37)));
        sortedReviews.add(new Review(5, "Так себе товар", 100, LocalDateTime.of(2024, 1, 25, 10, 37)));
        sortedReviews.add(new Review(4, "Так себе товар", 100, LocalDateTime.of(2024, 1, 25, 7, 37)));
        sortedReviews.add(new Review(2, "Так себе товар", 100, LocalDateTime.of(2024, 1, 25, 1, 37)));

        for (Review review : sortedReviews) {
            System.out.println(review);
        }
    }
}
