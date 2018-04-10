package org.chenguoyu.factory.abstracts.factory.impl;

import org.chenguoyu.factory.abstracts.factory.PizzaIngredientFactory;
import org.chenguoyu.factory.abstracts.ingredient.*;
import org.chenguoyu.factory.abstracts.ingredient.impl.ny.*;
import org.chenguoyu.factory.abstracts.ingredient.veggies.Garlic;
import org.chenguoyu.factory.abstracts.ingredient.veggies.Mushroom;
import org.chenguoyu.factory.abstracts.ingredient.veggies.Onion;
import org.chenguoyu.factory.abstracts.ingredient.veggies.RedPepper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author chenguoyu
 * @date 2018-04-10
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public List<Veggies> createVeggies() {
        return new ArrayList<Veggies>(Arrays.asList(new Garlic(), new Onion(), new Mushroom(), new RedPepper()));
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClams() {
        return new FreshClams();
    }
}
