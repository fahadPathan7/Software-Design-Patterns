package burger_builder;

public class Client {
    public static void main(String[] args) {
        BurgerBuilder burgerBuilder = new BurgerBuilder();

        Burger burger = burgerBuilder.setCheese("italian").setLettuce("larger").setOnion("indian").build();
        burger.getCheese();
        burger.getLettuce();
        burger.getOnion();
    }
}
