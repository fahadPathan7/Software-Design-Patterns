package burger_builder;

public class BurgerBuilder {
    Burger burger;

    public BurgerBuilder() {
        this.burger = new Burger();
    }

    public BurgerBuilder setCheese(String cheese) {
        burger.setCheese(cheese);
        return this;
    }

    public BurgerBuilder setLettuce(String lettuce) {
        burger.setLettuce(lettuce);
        return this;
    }

    public BurgerBuilder setOnion(String onion) {
        burger.setOnion(onion);
        return this;
    }

    public Burger build() {
        return burger;
    }
}


