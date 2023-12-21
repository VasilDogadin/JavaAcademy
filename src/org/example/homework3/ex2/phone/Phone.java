package org.example.homework3.ex2.phone;

import org.example.homework3.ex2.components.Board;
import org.example.homework3.ex2.components.Camera;
import org.example.homework3.ex2.components.OperationalSystem;

public abstract class Phone {
    private final String model;
    private OperationalSystem operationalSystem;
    private Board board;
    private Camera camera;

    public Phone(String model) {
        this.model = model;
    }

    public void setOperationalSystem(OperationalSystem operationalSystem) {
        this.operationalSystem = operationalSystem;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    protected void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "model='" + model + '\'' +
                ", operationalSystem=" + operationalSystem +
                ", board=" + board +
                ", camera=" + camera +
                '}';
    }
}

