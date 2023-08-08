package space_factory.creator;

import space_factory.product.Planets;

public abstract class PlanetsFactory {
    public abstract Planets createPlanets(int score);
}
