package org.example.module2.homework3.ex3;

public class Runner {

    public static void main(String[] args) {

        String name = "Юрий";
        Human person = new Human(30, 180);

        boolean chamomilePrediction = predict(name, s -> s.length() % 2 == 0);
        boolean grandmaPrediction = predict(person, p -> (p.getAge() + p.getHeight()) > 210);

        System.out.println(name + ": " + (chamomilePrediction));
        System.out.println(name + ": " + person.getAge()
                + " лет, рост " + person.getHeight() + ": " + (grandmaPrediction));
    }

    private static <T> boolean predict(T input, Divination<T> fortuneTeller) {
        return fortuneTeller.predict(input);
    }
}
