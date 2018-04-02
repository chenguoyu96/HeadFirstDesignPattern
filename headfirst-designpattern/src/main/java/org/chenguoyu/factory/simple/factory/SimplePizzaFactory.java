package org.chenguoyu.factory.simple.factory;

import org.chenguoyu.factory.simple.pizza.*;

/**
 * @author chenguoyu
 * @date 2018-04-02
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new CheesePizza();
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