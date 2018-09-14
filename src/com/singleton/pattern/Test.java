package com.singleton.pattern;

public class Test {

    public static void main(String[] args) {
        ProductCatalouge productCatalouge=ProductCatalouge.getProductCatalouge();
        productCatalouge.checkout();
    }
}
