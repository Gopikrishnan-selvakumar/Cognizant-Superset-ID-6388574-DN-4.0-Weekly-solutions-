package com.observer.stock;

public class Demo {
    public static void main(String[] args) {

        StockMarket market = new StockMarket();

        Observer aliceMobile = new MobileApp("Alice");
        Observer bobMobile   = new MobileApp("Bob");
        Observer portal      = new WebApp("stocks.example.com");

        market.register(aliceMobile);
        market.register(portal);

        market.setPrice("AAPL", 188.45);          // Alice + portal
        System.out.println("-----");

        market.register(bobMobile);               // Bob joins
        market.setPrice("GOOG", 143.20);          // Alice + Bob + portal
        System.out.println("-----");

        market.deregister(aliceMobile);           // Alice leaves
        market.setPrice("AAPL", 190.02);          // Bob + portal
    }
}
