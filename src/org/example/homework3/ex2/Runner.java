package org.example.homework3.ex2;

public class Runner {
    public static void main(String[] args) {
        Phone iphone = PhoneFactory.assembleIphone();
        System.out.println("Собран iPhone");
        iphone.printPhoneDetails();
        System.out.println();

        Phone samsung = PhoneFactory.assembleSamsung();
        System.out.println("Собран Samsung");
        samsung.printPhoneDetails();
    }
}
