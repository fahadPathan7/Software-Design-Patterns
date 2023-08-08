package space_factory.concrete_creator;

import space_factory.concrete_product.Ice_Asteroids;
import space_factory.concrete_product.Iron_Asteroids;
import space_factory.creator.AsteroidsFactory;
import space_factory.product.Asteroids;

public class Level1AsteroidsFactory extends AsteroidsFactory {

    @Override
    public Asteroids createAsteroids(int score) {
        if(score > 500) return new Ice_Asteroids();
        else return new Iron_Asteroids();
    }
}