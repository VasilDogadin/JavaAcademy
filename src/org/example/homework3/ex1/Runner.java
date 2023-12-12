package org.example.homework3.ex1;

public class Runner {
    public static void main(String[] args) {
        Conifer pine = new Conifer("сосна", 40, "крупные");
        Conifer spruce = new Conifer("ель", 100, "мелкие");
        Deciduous birch = new Deciduous("Берёза", 20, true, true);
        birch.leavesBloom();

        Tree[] trees = {pine, spruce, birch};

        int totalAge = 0;
        for (Tree tree : trees) {
            totalAge += tree.getAge();
        }

        int averageAge = totalAge / trees.length;
        System.out.println("Средний возраст = " + averageAge + " года");
    }
} 
