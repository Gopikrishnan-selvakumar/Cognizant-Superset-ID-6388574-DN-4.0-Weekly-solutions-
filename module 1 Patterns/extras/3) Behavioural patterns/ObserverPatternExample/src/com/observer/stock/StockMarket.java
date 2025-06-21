package com.observer.stock;

import java.util.*;

/** Concrete Subject – holds state and notifies observers. */
public class StockMarket implements Subject {

    private final Map<String, Double> prices = new HashMap<>();
    private final List<Observer> observers = new ArrayList<>();

    // business method – change price
    public void setPrice(String ticker, double newPrice) {
        prices.put(ticker, newPrice);
        notifyObservers();               // push update to all clients
    }

    /* Subject interface implementation */
    @Override public void register(Observer o)   { observers.add(o); }
    @Override public void deregister(Observer o) { observers.remove(o); }

    @Override public void notifyObservers() {
        prices.forEach((tkr, pr) ->
                observers.forEach(o -> o.update(tkr, pr))
        );
    }
}
