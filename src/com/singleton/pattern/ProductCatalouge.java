package com.singleton.pattern;

public class ProductCatalouge {

    private static ProductCatalouge productCatalouge=new ProductCatalouge();

    private ProductCatalouge(){

    }

    public void checkout(){
        System.out.println("hello checkout api");
    }


    public static ProductCatalouge getProductCatalouge() {
        return productCatalouge;
    }

    public static void setProductCatalouge(ProductCatalouge productCatalouge) {
        ProductCatalouge.productCatalouge = productCatalouge;
    }
}
