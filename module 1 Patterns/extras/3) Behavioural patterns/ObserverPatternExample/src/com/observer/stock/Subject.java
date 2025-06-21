package com.observer.stock;

/** Subject declares attach / detach / notify. */
public interface Subject {
    void register(Observer o);
    void deregister(Observer o);
    void notifyObservers();
}
