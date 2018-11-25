package org.chenguoyu.state.gumballstate.state.impl;

import org.chenguoyu.state.gumballstate.GumballMachine;
import org.chenguoyu.state.gumballstate.state.State;

/**
 * @author chenguoyu
 * @date 2018-04-30
 * @project headfirst-designpattern
 */
public class NoQuarterState implements State {
    private GumballMachine gumballMachine;

    public NoQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned but there's no quarter");
    }

    @Override
    public void dispense() {
        System.out.println("You need to pay first");
    }

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "waiting for quarter";
    }
}
