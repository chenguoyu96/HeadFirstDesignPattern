package org.chenguoyu.templatemethod.example.nohook;

/**
 * @author chenguoyu
 * @date 2018-04-17
 * @project headfirst-designpattern
 */
public abstract class CaffeineBeverage {
    /**
     * 两种冲泡的方法基本上是相同的，只是一些步骤需要不同的实现，所以我们泛化了冲泡法，把他放在基类
     */
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    public abstract void brew();

    public abstract void addCondiments();

    public void boilWater() {
        System.out.println("Boiling water");
    }

    public void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
