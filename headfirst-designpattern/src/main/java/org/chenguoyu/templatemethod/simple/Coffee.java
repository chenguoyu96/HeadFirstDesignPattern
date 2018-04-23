package org.chenguoyu.templatemethod.simple;

/**
 * @author chenguoyu
 * @date 2018-04-17
 * @project headfirst-designpattern
 */
public class Coffee extends CaffeineBeverage {
    @Override
    public void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }


    public void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }


    public void addSugarAndMilk() {
        System.out.println("Adding sugar and Milk");
    }
}
