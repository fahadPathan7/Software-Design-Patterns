package SOLID_principles;

public class InterfaceSegregationPrinciple {
}


// a class should not be forced to implement interfaces it doesn't use.

interface Area {
    void area();
}

interface Volume {
    void volume();
}

class Square implements Area {

    @Override
    public void area() {
        // area calculation
    }
}

class Sphere implements Volume {

    @Override
    public void volume() {
        // calculating volume
    }
}
