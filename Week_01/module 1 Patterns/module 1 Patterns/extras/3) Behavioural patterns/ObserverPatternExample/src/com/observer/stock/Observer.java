package com.observer.stock;

/** Observer declares the callback */
public interface Observer {
    void update(String ticker, double price);
}
