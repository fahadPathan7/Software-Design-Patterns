package design_patterns.creational_design_patterns;

class Builder {
}

class Car {
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

class CarBuilder {
    Car bp;

    public CarBuilder() {
        this.bp = new Car();
    }

    public CarBuilder setWheel(String wheel) {
        bp.setWheel(wheel);
        return this;
    }

    public CarBuilder setSteering(String steering) {
        bp.setSteering(steering);
        return this;
    }

    public CarBuilder setEngine(String engine) {
        bp.setEngine(engine);
        return this;
    }

    public Car build() {
        return bp;
    }
}

class client {
    public static void main(String[] args) {
        CarBuilder bd = new CarBuilder();
        Car bp = bd.setWheel("company a").setEngine("company c").build();

        bp.getWheel();
        bp.getSteering();
        bp.getEngine();
    }
}