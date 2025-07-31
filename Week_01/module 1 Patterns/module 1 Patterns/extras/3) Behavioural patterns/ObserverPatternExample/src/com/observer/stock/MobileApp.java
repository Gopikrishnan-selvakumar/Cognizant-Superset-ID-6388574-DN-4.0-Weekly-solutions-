package com.observer.stock;

public class MobileApp implements Observer {
    private final String owner;

    public MobileApp(String owner) {
        this.owner = owner;
    }

    @Override
    public void update(String ticker, double price) {
        System.out.printf("📱  %s's mobile → %s : %.2f%n", owner, ticker, price);
    }
}
