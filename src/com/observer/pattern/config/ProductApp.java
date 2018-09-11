package com.observer.pattern.config;

import com.observer.pattern.impl.Customer;
import com.observer.pattern.impl.Product;

public class ProductApp {
    public static void main(String[] args) {

        Customer customer=new Customer();
        customer.setCustomerName("vaibhav");

        Customer customer1=new Customer();
        customer1.setCustomerName("ajay");

        Product product=new Product();
        product.setProductName("iphone");
        product.setIsavailable(false);

        product.registerCustomer(customer);

        product.registerCustomer(customer1);

        product.setIsavailable(true);

        product.removeCustomer(customer);
        product.setIsavailable(true);

    }
}
