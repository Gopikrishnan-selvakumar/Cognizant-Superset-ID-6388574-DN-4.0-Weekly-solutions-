package com.builder.example;

public class Computer {

    private String cpu;
    private int ram;

    private int storage; // GB
    private boolean hasGraphicsCard;
    private boolean hasWiFi;
    private boolean hasBluetooth;
    private String display;

    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasWiFi = builder.hasWiFi;
        this.hasBluetooth = builder.hasBluetooth;
        this.display = builder.display;
    }

    public static class Builder {
        private String cpu;
        private int ram;

        private int storage;
        private boolean hasGraphicsCard;
        private boolean hasWiFi;
        private boolean hasBluetooth;
        private String display;

        public Builder(String cpu, int ram) {
            this.cpu = cpu;
            this.ram = ram;
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this;
        }

        public Builder setWiFi(boolean hasWiFi) {
            this.hasWiFi = hasWiFi;
            return this;
        }

        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public void showSpecs() {
        System.out.println("CPU: " + cpu);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Graphics Card: " + hasGraphicsCard);
        System.out.println("WiFi: " + hasWiFi);
        System.out.println("Bluetooth: " + hasBluetooth);
        System.out.println("Display: " + display);
    }
}
