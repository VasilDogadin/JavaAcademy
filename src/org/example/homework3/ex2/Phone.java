package org.example.homework3.ex2;

public abstract class Phone {
    protected String model;
    protected String operatingSystem;
    protected Board board;
    protected Camera camera;

    public Phone(String model, String operatingSystem, Board board, Camera camera) {
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.board = board;
        this.camera = camera;
    }

    public void printPhoneDetails() {
        System.out.println("Модель телефона: " + model);
        System.out.println("Операционная система: " + operatingSystem);
        board.printBoardDetails();
        camera.printCameraDetails();
    }
}

