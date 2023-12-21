package org.example.homework3.ex2.phone;

import org.example.homework3.ex2.components.IphoneCamera;

public class Iphone extends Phone {
    private static final String MODEL = "Iphone 15";

    public Iphone() {
        super(MODEL);
    }

    public void setCamera(IphoneCamera iphoneCamera) {
        super.setCamera(iphoneCamera);
    }
}
