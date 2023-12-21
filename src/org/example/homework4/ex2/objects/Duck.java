package org.example.homework4.ex2.objects;

import org.example.homework4.ex2.exceptions.FlyException;
import org.example.homework4.ex2.interfaces.Flying;

public class Duck implements Flying {
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("утка ранена");
        } else {
            System.out.println("утка летит");
        }
    }
}
