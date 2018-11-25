package org.chenguoyu.factory.method.store;

import org.chenguoyu.factory.method.PizzaStore;
import org.chenguoyu.factory.method.pizza.*;


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
