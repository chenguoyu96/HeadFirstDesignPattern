package org.chenguoyu.factory.abstracts.store;

import org.chenguoyu.factory.abstracts.PizzaStore;
import org.chenguoyu.factory.abstracts.pizza.*;


/**
 * @author chenguoyu
 * @date 2018-04-02
 */
public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "pepperoni":
                return new PepperoniPizza();
            case "clam":
                return new ClamPizza();
            case "veggie":
                return new VegglePizza();
            default:
                return null;
        }
    }
}
