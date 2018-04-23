package org.chenguoyu.templatemethod.simple;

/**
 * @author chenguoyu
 * @date 2018-04-17
 * @project headfirst-designpattern
 */
public class Tea extends CaffeineBeverage {
    @Override
    public void prepareRecipe() {
        boilWater();
        brewTeaBag();
        pourInCup();
        addLemon();
    }

    public void brewTeaBag() {
        System.out.println("Steeping the tea");
    }

    public void addLemon() {
        System.out.println("Adding Lemon");
    }
}
