package org.chenguoyu.factory.method;

import org.chenguoyu.factory.method.pizza.Pizza;


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
     * 工厂方法用来处理对象的创建，并将这样的行为封装在子类中。这样，客户程序中关于超类的代码就和子类对象的创建解耦了。
     * @param type
     * @return
     */
    public abstract Pizza createPizza(String type);
}
