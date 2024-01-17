package org.example.module1.homework3.ex2.phone;

import org.example.module1.homework3.ex2.components.SamsungCamera;

public class SamsungGalaxy extends Phone {

    private static final String MODEL = "Samsung galaxy";

    public SamsungGalaxy() {
        super(MODEL);
    }

    public void setCamera(SamsungCamera samsungCamera) {
        super.setCamera(samsungCamera);
    }

}
