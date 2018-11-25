package org.chenguoyu.templatemethod.example.nohook;

/**
 * @author chenguoyu
 * @date 2018-04-17
 * @project headfirst-designpattern
 */
public class Coffee extends CaffeineBeverage {

    @Override
    public void brew() {
        System.out.println("Dripping Coffee through filter");

    }

    @Override
    public void addCondiments() {
        System.out.println("Adding sugar and Milk");

    }

}
