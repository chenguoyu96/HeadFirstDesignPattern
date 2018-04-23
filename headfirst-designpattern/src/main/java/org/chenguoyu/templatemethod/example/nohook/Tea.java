package org.chenguoyu.templatemethod.example.nohook;

/**
 * @author chenguoyu
 * @date 2018-04-17
 * @project headfirst-designpattern
 */
public class Tea extends CaffeineBeverage {
    @Override
    public void brew() {
        System.out.println("Steeping the tea");
    }

    @Override
    public void addCondiments() {
        System.out.println("Adding Lemon");
    }

}
