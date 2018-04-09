package org.chenguoyu.factory.abstracts.pizza;

/**
 * @author chenguoyu
 * @date 2018-04-02
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "ChicagoStyle Deep Dish Cheese Pizza";
        dough = "Extra Think Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Grated Reggiano Cheese");
    }

    @Override
    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
