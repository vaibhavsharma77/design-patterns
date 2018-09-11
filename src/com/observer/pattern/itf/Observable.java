package com.observer.pattern.itf;

public interface Observable {
    public void registerCustomer(Observer observer);
    public void removeCustomer(Observer observer);
    public void notifyCustomer();
}
