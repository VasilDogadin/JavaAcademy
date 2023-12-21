package org.example.homework3.ex2.components;

public abstract class Camera {
    protected final int zoom;

    public Camera(int zoom) {
        this.zoom = zoom;
    }

    public int getZoom() {
        return zoom;
    }

    @Override
    public String toString() {
        return "Camera{" +
                "zoom=" + zoom +
                '}';
    }
}
