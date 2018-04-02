package org.chenguoyu.factory.abstracts;

import org.chenguoyu.factory.abstracts.pizza.Pizza;


/**
 * @author chenguoyu
 * @date 2018-04-02
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 工厂方法
     * @param type
     * @return
     */
    public abstract Pizza createPizza(String type);
}
