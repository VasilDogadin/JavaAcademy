package org.example.module1.homework3.ex2.factory;

import org.example.module1.homework3.ex2.components.Board;
import org.example.module1.homework3.ex2.components.IphoneCamera;
import org.example.module1.homework3.ex2.components.OperationalSystem;
import org.example.module1.homework3.ex2.components.SamsungCamera;
import org.example.module1.homework3.ex2.phone.Iphone;
import org.example.module1.homework3.ex2.phone.SamsungGalaxy;

public class PhoneFactory {

    public void assembly(Iphone iphone) {
        iphone.setCamera(new IphoneCamera());
        iphone.setBoard(new Board(15, 12, 13, "7uik"));
        iphone.setOperationalSystem(new OperationalSystem("ios"));
    }

    public void assembly(SamsungGalaxy samsung) {
        samsung.setCamera(new SamsungCamera());
        samsung.setBoard(new Board(10, 12, 13, "j-108"));
        samsung.setOperationalSystem(new OperationalSystem("android"));
    }

}
