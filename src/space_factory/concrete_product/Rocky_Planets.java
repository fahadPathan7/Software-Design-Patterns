package space_factory.concrete_product;

import space_factory.product.Planets;

public class Rocky_Planets implements Planets {
    @Override
    public void show() {
        System.out.println("Rocky_Planets popped up");
    }
}