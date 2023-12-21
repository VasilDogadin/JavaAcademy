package org.example.homework3.ex2.components;

public class SamsungCamera extends Camera {

    private static final int ZOOM = 20;

    public SamsungCamera() {
        super(ZOOM);
    }

    @Override
    public String toString() {
        return "SamsungCamera{" +
                "zoom=" + zoom +
                '}';
    }
}
