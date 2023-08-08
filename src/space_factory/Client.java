package space_factory;

import space_factory.concrete_creator.Level1AsteroidsFactory;
import space_factory.concrete_creator.Level1PlanetsFactory;
import space_factory.concrete_creator.Level2AsteroidsFactory;
import space_factory.concrete_creator.Level2PlanetsFactory;
import space_factory.creator.AsteroidsFactory;
import space_factory.creator.PlanetsFactory;
import space_factory.product.Asteroids;
import space_factory.product.Planets;

public class Client {
    public static void main(String[] args) {
        // asteroids factory
        int level = 2;

        AsteroidsFactory asteroidsFactory;

        if(level == 1) asteroidsFactory = new Level1AsteroidsFactory();
        else asteroidsFactory = new Level2AsteroidsFactory();

        int score = 500;

        Asteroids asteroids = asteroidsFactory.createAsteroids(score);
        asteroids.show();


        // planets factory
        level = 1;

        PlanetsFactory planetsFactory;

        if(level == 1) planetsFactory = new Level1PlanetsFactory();
        else planetsFactory = new Level2PlanetsFactory();

        score = 200;

        Planets planets = planetsFactory.createPlanets(score);
        planets.show();
    }
}