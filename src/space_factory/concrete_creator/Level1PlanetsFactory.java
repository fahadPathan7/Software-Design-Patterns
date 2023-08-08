package space_factory.concrete_creator;


import space_factory.concrete_product.Ice_Planets;
import space_factory.concrete_product.Iron_Planets;
import space_factory.creator.PlanetsFactory;
import space_factory.product.Planets;

public class Level1PlanetsFactory extends PlanetsFactory {

    @Override
    public Planets createPlanets(int score) {
        if(score > 500) return new Ice_Planets();
        else return new Iron_Planets();
    }
}
