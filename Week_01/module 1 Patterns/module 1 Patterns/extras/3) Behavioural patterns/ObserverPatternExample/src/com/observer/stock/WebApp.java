package com.observer.stock;

public class WebApp implements Observer {
    private final String domain;

    public WebApp(String domain) {
        this.domain = domain;
    }

    @Override
    public void update(String ticker, double price) {
        System.out.printf("🖥  %s → %s : %.2f%n", domain, ticker, price);
    }
}
