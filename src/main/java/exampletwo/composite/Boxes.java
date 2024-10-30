package exampletwo.composite;

import exampletwo.component.Box;

import java.util.ArrayList;
import java.util.List;


public class Boxes implements Box {
    private double price;
    private List<Box> boxes;

    public Boxes() {
        boxes = new ArrayList<>();
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;

        for (Box box : boxes)
            totalPrice += box.getPrice();

        setPrice(totalPrice);
        return totalPrice;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public void addBox(Box box) {
        boxes.add(box);
    }

    public void removeBox(Box box) {
        boxes.remove(box);
    }

    @Override
    public void displayPrice() {
        System.out.println("Price of Boxes " + getPrice());

    }
}
