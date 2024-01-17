package org.example.module2.homework1.ex1;

public class Runner {

    @SuppressWarnings("checkstyle:Indentation")
    public static void main(String[] args) {

        Tiger tiger = new Tiger("Тигр");
        Dog dog = new Dog("Собака");
        Bird bird = new Bird("Птица");

        Zoo<Animal> zoo = new Zoo<>();
        zoo.addAnimal(tiger);
        zoo.addAnimal(dog);
        zoo.addAnimal(bird);

        try {
            zoo.getAnimal(0).performAction();
            zoo.getAnimal(1).performAction();
            zoo.getAnimal(2).performAction();
        } catch (AnimalIndexNotFoundException e) {
            System.out.println("Ошибка при получении животного: " + e.getMessage());
        }

        System.out.println();
        zoo.makeSounds();
        zoo.performActions();
    }
}
