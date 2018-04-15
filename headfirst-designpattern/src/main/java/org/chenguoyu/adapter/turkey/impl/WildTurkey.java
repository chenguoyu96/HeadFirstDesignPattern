package org.chenguoyu.adapter.turkey.impl;

import org.chenguoyu.adapter.turkey.Turkey;

/**
 * @author chenguoyu
 * @date 2018-04-15
 * @project headfirst-designpattern
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I am flying a short distance");
    }
}
