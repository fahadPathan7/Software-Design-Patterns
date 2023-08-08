package design_patterns.structural_design_pattern;

public class Decorator {
}

interface Pizza {
    String getDescription();
    double getPrice();
}

class PlainPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Plain Pizza";
    }

    @Override
    public double getPrice() {
        return 5.5;
    }
}

class PizzaDecorator implements Pizza {
    Pizza decoratedPizza;

    PizzaDecorator(Pizza decoratedPizza) {
        this.decoratedPizza = decoratedPizza;
    }

    @Override
    public String getDescription() {
        return decoratedPizza.getDescription();
    }

    @Override
    public double getPrice() {
        return decoratedPizza.getPrice();
    }
}

class PizzaWithMushroom extends PizzaDecorator {

    PizzaWithMushroom(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    public String getDescription() {
        return super.decoratedPizza.getDescription() + " mushroom";
    }

    public double getPrice() {
        return super.decoratedPizza.getPrice() + 1.3;
    }
}

class PizzaWithCheese extends PizzaDecorator {
    PizzaWithCheese(Pizza decoratedPizza) {
        super(decoratedPizza);
    }

    public String getDescription() {
        return super.decoratedPizza.getDescription() + " cheese";
    }

    public double getPrice() {
        return super.decoratedPizza.getPrice() + 1.7;
    }
}

class Main {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();

        System.out.println(pizza.getDescription() + " " + pizza.getPrice());


        Pizza pizzaMushroom = new PizzaWithMushroom(pizza);

        System.out.println(pizzaMushroom.getDescription() + " " + pizzaMushroom.getPrice());

        Pizza pizzaCheese = new PizzaWithCheese(pizzaMushroom);

        System.out.println(pizzaCheese.getDescription() + " " + pizzaCheese.getPrice());
    }
}