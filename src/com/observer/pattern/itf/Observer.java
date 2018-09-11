package com.observer.pattern.itf;

import com.observer.pattern.impl.Product;

public interface Observer {
    public void update(String productName);
}
