package org.chenguoyu.factory.abstracts.factory;

import org.chenguoyu.factory.abstracts.ingredient.*;

import java.util.List;

/**
 * 披萨原料抽象工厂
 *
 * @author chenguoyu
 * @date 2018-04-10
 */
public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    List<Veggies> createVeggies();

    Pepperoni createPepperoni();

    Clams createClams();
}
