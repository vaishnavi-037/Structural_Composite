package exampletwo;

import exampletwo.component.Box;
import exampletwo.composite.Boxes;
import exampletwo.leaf.ProductA;

public class ShopManagementApplication {
    public static void main(String[] args) {
        Box product1 = new ProductA(20);
        Box product2= new ProductA(55);
        Box product3 = new ProductA(76);

        Boxes smallBox = new Boxes();
        smallBox.addBox(product1);
        smallBox.addBox(product2);
        smallBox.addBox(product3);

        Boxes largeBox = new Boxes();
        largeBox.addBox(smallBox);
        largeBox.addBox(product1);
        largeBox.addBox(product2);

        largeBox.displayPrice();
    }
}
