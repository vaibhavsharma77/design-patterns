package com.observer.pattern.impl;

import com.observer.pattern.itf.Observable;
import com.observer.pattern.itf.Observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Observable {

    List<Observer> customers=new ArrayList<>();

    private String productName;

    private boolean isavailable;

    public List<Observer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Observer> customers) {
        this.customers = customers;
    }


    public boolean isIsavailable() {
        return isavailable;
    }

    public void setIsavailable(boolean isavailable) {
        this.isavailable = isavailable;
        if(isavailable==true){
            notifyCustomer();
        }

    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }


    @Override
    public void registerCustomer(Observer observer) {
          customers.add(observer);
    }

    @Override
    public void removeCustomer(Observer observer) {
        customers.remove(observer);
    }

    @Override
    public void notifyCustomer() {
        for(Observer observer:customers){
            observer.update(this.productName);
        }
    }


}
