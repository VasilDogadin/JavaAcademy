package org.example.module1.homework3.ex1;

public class Runner {
    public static void main(String[] args) {
        Tree[] trees = {
            new Pine("сосна", 100),
            new Fir("хвоя", 100),
            new Birch("берёза", 100)
        };

        double sum  = 0;
        for (Tree tree : trees) {
            sum += tree.getAge();
        }

        double totalAge = sum / trees.length;
        System.out.println("Средний возраст = " + totalAge + " лет");
    }
} 
