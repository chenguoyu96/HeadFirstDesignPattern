package org.chenguoyu.templatemethod.simple;

/**
 * @author chenguoyu
 * @date 2018-04-17
 * @project headfirst-designpattern
 */
public abstract class CaffeineBeverage {
    public abstract void prepareRecipe();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
