package creational_design_patterns.singleton;

public class Builder_Practice {
    private String wheel;
    private String steering;
    private String engine;

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }
    public void setSteering(String steering) {
        this.steering = steering;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void getWheel() {
        System.out.println("Wheel: " + wheel);
    }
    public void getSteering() {
        System.out.println("Steering: " + steering);
    }
    public void getEngine() {
        System.out.println("Engine: " + engine);
    }
}

class Builder {
    Builder_Practice bp;

    public Builder() {
        this.bp = new Builder_Practice();
    }

    public Builder setWheel(String wheel) {
        bp.setWheel(wheel);
        return this;
    }

    public Builder setSteering(String steering) {
        bp.setSteering(steering);
        return this;
    }

    public Builder setEngine(String engine) {
        bp.setEngine(engine);
        return this;
    }

    public Builder_Practice build() {
        return bp;
    }
}

class client {
    public static void main(String[] args) {
        Builder bd = new Builder();
        Builder_Practice bp = bd.setWheel("company a").setEngine("company c").build();

        bp.getWheel();
        bp.getSteering();
        bp.getEngine();
    }
}