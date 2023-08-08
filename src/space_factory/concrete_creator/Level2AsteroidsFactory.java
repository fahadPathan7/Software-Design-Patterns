package space_factory.concrete_creator;

import space_factory.concrete_product.Rocky_Asteroids;
import space_factory.concrete_product.Silicon_Asteroids;
import space_factory.creator.AsteroidsFactory;
import space_factory.product.Asteroids;

public class Level2AsteroidsFactory extends AsteroidsFactory {
    @Override
    public Asteroids createAsteroids(int score) {
        if(score > 1000) return new Rocky_Asteroids();
        else return new Silicon_Asteroids();
    }
}
