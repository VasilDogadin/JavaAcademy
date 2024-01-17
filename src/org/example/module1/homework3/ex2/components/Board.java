package org.example.module1.homework3.ex2.components;

public class Board {
    private final int width;
    private final int length;
    private final int height;
    private final String model;

    public Board(int width, int length, int height, String model) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.model = model;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Board{" + "width=" + width + ", length=" + length + ", height=" + height + ", model='" + model + '\'' + '}';
    }
}
