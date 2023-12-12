package org.example.homework3.ex2;

public class PhoneFactory {

    public static Iphone assembleIphone() {
        Board board = new Board(15, 12, 13, "7uik");
        Camera camera = new Camera(15, true, "iphone");
        return new Iphone("iPhone 15", "iOS", board, camera);
    }

    public static SamsungGalaxy assembleSamsung() {
        Board board = new Board(10, 12, 13, "j-108");
        Camera camera = new Camera(20, false, "Samsung");
        return new SamsungGalaxy("Samsung Galaxy", "Android", board, camera);
    }
}
