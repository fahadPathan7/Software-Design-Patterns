package burger_builder;

public class Burger {
    private String cheese;
    private String lettuce;
    private String onion;

    public void setCheese(String cheese) {
        this.cheese = cheese;
    }
    public void setLettuce(String lettuce) {
        this.lettuce = lettuce;
    }
    public void setOnion(String onion) {
        this.onion = onion;
    }

    public void getCheese() {
        System.out.println("Cheese: " + cheese);
    }
    public void getLettuce() {
        System.out.println("Lettuce: " + lettuce);
    }
    public void getOnion() {
        System.out.println("Onion: " + onion);
    }
}
