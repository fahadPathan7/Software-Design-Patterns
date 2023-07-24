package behavioral_design_pattern;

public interface State {
    void next(DeliveryPackage deliveryPackage);
    void prev(DeliveryPackage deliveryPackage);
    void print();
}

class OrderState implements State {

    @Override
    public void next(DeliveryPackage deliveryPackage) {
        deliveryPackage.setState(new DeliverState());
    }

    @Override
    public void prev(DeliveryPackage deliveryPackage) {
        System.out.println("No previous");
    }

    @Override
    public void print() {
        System.out.println("The order is placed");
    }
}

class DeliverState implements State {

    @Override
    public void next(DeliveryPackage deliveryPackage) {
        deliveryPackage.setState(new ReceivedState());
    }

    @Override
    public void prev(DeliveryPackage deliveryPackage) {
        deliveryPackage.setState(new OrderState());
    }

    @Override
    public void print() {
        System.out.println("Order is delivered");
    }
}

class ReceivedState implements State {

    @Override
    public void next(DeliveryPackage deliveryPackage) {
        System.out.println("No next state");
    }

    @Override
    public void prev(DeliveryPackage deliveryPackage) {
        deliveryPackage.setState(new DeliverState());
    }

    @Override
    public void print() {
        System.out.println("Order is received");
    }
}

class DeliveryPackage {
    State state;

    DeliveryPackage() {
        state = new OrderState();
    }

    void setNext() {
        state.next(this);
    }

    void setPrev() {
        state.prev(this);
    }

    void setState(State state) {
        this.state = state;
    }

    void printStatus() {
        state.print();
    }
}

class Main5 {
    public static void main(String[] args) {
        DeliveryPackage deliveryPackage = new DeliveryPackage();
        deliveryPackage.printStatus();
        deliveryPackage.setNext();
        deliveryPackage.printStatus();
        deliveryPackage.setNext();
        deliveryPackage.printStatus();
        deliveryPackage.setNext();
        deliveryPackage.printStatus();
    }
}

