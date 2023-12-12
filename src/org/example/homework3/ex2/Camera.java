package org.example.homework3.ex2;

public class Camera {
    protected int zoom;
    protected boolean hasFlash;
    protected String cameraName;

    public Camera(int zoom, boolean hasFlash, String cameraName) {
        this.zoom = zoom;
        this.hasFlash = hasFlash;
        this.cameraName = cameraName;
    }

    public void printCameraDetails() {
        String result = hasFlash ? "Да" : "Нет";
        System.out.println("Камера " + cameraName + ": зум " + zoom + "x");
        System.out.println("Есть вспышка: " + result);
    }
}
