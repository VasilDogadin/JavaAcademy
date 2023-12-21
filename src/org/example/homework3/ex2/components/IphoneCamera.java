package org.example.homework3.ex2.components;

import org.example.homework3.ex2.components.Camera;

public class IphoneCamera extends Camera {

    private static final int ZOOM = 15;
    private final boolean hasFlash = true;

    public IphoneCamera() {
        super(ZOOM);
    }

    public boolean isHasFlash() {
        return hasFlash;
    }

    @Override
    public String toString() {
        return "IphoneCamera{" +
                "zoom=" + zoom +
                ", hasFlash=" + hasFlash +
                '}';
    }
}
