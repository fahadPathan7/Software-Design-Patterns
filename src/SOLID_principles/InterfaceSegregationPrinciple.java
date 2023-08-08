package SOLID_principles;

public class InterfaceSegregationPrinciple {
}


// a class should not be forced to implement interfaces it doesn't use.

interface Fly {
    void fly();
}

interface Walk {
    void walk();
}

class Human implements Walk {

    @Override
    public void walk() {
        System.out.println("Human is walking");
    }
}

class Bird implements Fly {

    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}
