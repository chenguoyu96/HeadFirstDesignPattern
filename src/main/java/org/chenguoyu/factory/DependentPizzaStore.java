package org.chenguoyu.factory;

import org.chenguoyu.factory.method.pizza.NYStyleCheesePizza;
import org.chenguoyu.factory.method.pizza.Pizza;

/**
 * 如果不适用工厂模式
 *
 * @author chenguoyu
 * @date 2018-04-10
 */
public class DependentPizzaStore {

    public Pizza createPizza(String style, String type) {
        Pizza pizza = null;
        if ("NY".equals(style)) {
            if ("cheese".equals(type)) {
                pizza = new NYStyleCheesePizza();
            } else if ("veggie".equals(type)) {

            } else if ("clam".equals(type)) {

            } else if ("pepperoni".equals(type)) {

            }
        } else if ("Chicago".equals(style)) {
            if ("cheese".equals(type)) {

            } else if ("veggie".equals(type)) {

            } else if ("clam".equals(type)) {

            } else if ("pepperoni".equals(type)) {

            }
        } else {
            System.out.println("Error: invalid type of pizza");
            return null;
        }
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
