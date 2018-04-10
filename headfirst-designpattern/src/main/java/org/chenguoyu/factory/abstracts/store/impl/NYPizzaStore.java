package org.chenguoyu.factory.abstracts.store.impl;

import org.chenguoyu.factory.abstracts.factory.PizzaIngredientFactory;
import org.chenguoyu.factory.abstracts.factory.impl.NYPizzaIngredientFactory;
import org.chenguoyu.factory.abstracts.pizza.Pizza;
import org.chenguoyu.factory.abstracts.pizza.impl.CheesePizza;
import org.chenguoyu.factory.abstracts.pizza.impl.ClamPizza;
import org.chenguoyu.factory.abstracts.pizza.impl.VeggiePizza;
import org.chenguoyu.factory.abstracts.store.PizzaStore;


/**
 * @author chenguoyu
 * @date 2018-04-10
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        switch (type) {
            case "cheese":
                pizza = new CheesePizza(ingredientFactory);
                pizza.setName("New York Style cheese Pizza");
                break;
            case "veggie":
                pizza = new VeggiePizza(ingredientFactory);
                pizza.setName("New York Style Veggie Pizza");
                break;
            case "clam":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style clam Pizza");
                break;
            case "pepperoni":
                pizza = new ClamPizza(ingredientFactory);
                pizza.setName("New York Style pepperoni Pizza");
                break;
            default:
                pizza = null;
        }
        return pizza;
    }
}
