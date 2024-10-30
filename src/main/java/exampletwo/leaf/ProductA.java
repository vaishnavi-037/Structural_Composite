package exampletwo.leaf;

import exampletwo.component.Box;

public class ProductA implements Box {
    private double price;

    public ProductA(double price){
        this.price = price;
    }
    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void displayPrice() {
        System.out.println("Price of ProductA " + getPrice());
    }
}
