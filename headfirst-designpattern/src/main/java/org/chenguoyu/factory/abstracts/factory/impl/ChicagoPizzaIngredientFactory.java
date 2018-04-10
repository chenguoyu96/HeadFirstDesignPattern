package org.chenguoyu.factory.abstracts.factory.impl;

import org.chenguoyu.factory.abstracts.factory.PizzaIngredientFactory;
import org.chenguoyu.factory.abstracts.ingredient.*;
import org.chenguoyu.factory.abstracts.ingredient.impl.chicago.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author chenguoyu
 * @date 2018-04-10
 */
public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        return new ArrayList<Veggies>(Arrays.asList(new BlackOlives(), new Spinach(), new EggPlant()));
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperonl();
    }

    @Override
    public Clams createClams() {
        return new FrozenClams();
    }
}
