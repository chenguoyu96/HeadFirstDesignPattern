package org.chenguoyu.factory.abstracts.pizza.impl;


import org.chenguoyu.factory.abstracts.factory.PizzaIngredientFactory;
import org.chenguoyu.factory.abstracts.pizza.Pizza;

/**
 * @author chenguoyu
 * @date 2018-04-10
 */
public class VeggiePizza extends Pizza {
    private PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
