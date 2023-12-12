package org.example.homework3.ex2;

public class Board {
    protected int width;
    protected int length;
    protected int height;
    protected String boardName;

    public Board(int width, int length, int height, String boardName) {
        this.width = width;
        this.length = length;
        this.height = height;
        this.boardName = boardName;
    }

    public void printBoardDetails() {
        System.out.println("Плата: " + boardName);
        System.out.println("Размер платы: " + width
                + " x " + length
                + " x " + height);
    }
}
