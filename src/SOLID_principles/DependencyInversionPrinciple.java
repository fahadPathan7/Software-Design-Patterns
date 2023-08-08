package SOLID_principles;

public class DependencyInversionPrinciple {
}


// higher level modules should not depend on lower level modules. Instead, they both should depend on abstraction.

interface AreaCalc {
    void calculateArea(String height, String width);
}

class Square2 implements AreaCalc {

    @Override
    public void calculateArea(String height, String width) {
        // calculating area
    }
}

class Rectangle2 implements AreaCalc {

    @Override
    public void calculateArea(String height, String width) {
        // calculating area
    }
}


