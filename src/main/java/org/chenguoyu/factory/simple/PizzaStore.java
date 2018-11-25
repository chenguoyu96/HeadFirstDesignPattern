package org.chenguoyu.factory.simple;

import org.chenguoyu.factory.simple.factory.SimplePizzaFactory;
import org.chenguoyu.factory.simple.pizza.Pizza;

/**
 * @author chenguoyu
 * @date 2018-04-02
 */
public class PizzaStore {
    private SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
