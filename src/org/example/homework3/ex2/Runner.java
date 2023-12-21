package org.example.homework3.ex2;

import org.example.homework3.ex2.factory.PhoneFactory;
import org.example.homework3.ex2.phone.Iphone;
import org.example.homework3.ex2.phone.SamsungGalaxy;

public class Runner {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        SamsungGalaxy samsung = new SamsungGalaxy();

        PhoneFactory phoneFactory = new PhoneFactory();
        phoneFactory.assembly(iphone);
        phoneFactory.assembly(samsung);
        System.out.println(iphone);
        System.out.println(samsung);
    }
}
