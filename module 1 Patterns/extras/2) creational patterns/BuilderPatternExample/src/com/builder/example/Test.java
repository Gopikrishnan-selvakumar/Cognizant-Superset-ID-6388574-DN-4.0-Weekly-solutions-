package com.builder.example;

public class Test {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder("Intel i9", 32)
                .setStorage(1024)
                .setGraphicsCard(true)
                .setWiFi(true)
                .setBluetooth(true)
                .setDisplay("4k")
                .build();

        System.out.println("🎮 Gaming PC Specs:");
        gamingPC.showSpecs();

        System.out.println("\n🖥 Office PC Specs:");

        Computer officePC = new Computer.Builder("Intel i3", 8)
                .setStorage(256)
                .setWiFi(true)
                .setDisplay("1080p")
                .build();

        officePC.showSpecs();
    }
}
