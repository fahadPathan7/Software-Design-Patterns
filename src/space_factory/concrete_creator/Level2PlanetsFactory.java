package space_factory.concrete_creator;

import space_factory.concrete_product.Rocky_Planets;
import space_factory.concrete_product.Silicon_Planets;
import space_factory.creator.PlanetsFactory;
import space_factory.product.Planets;

public class Level2PlanetsFactory extends PlanetsFactory {
    @Override
    public Planets createPlanets(int score) {
        if(score > 1000) return new Rocky_Planets();
        else return new Silicon_Planets();
    }
}
