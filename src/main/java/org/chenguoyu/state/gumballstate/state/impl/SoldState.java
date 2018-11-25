package org.chenguoyu.state.gumballstate.state.impl;

import org.chenguoyu.state.gumballstate.GumballMachine;
import org.chenguoyu.state.gumballstate.state.State;

/**
 * @author chenguoyu
 * @date 2018-04-30
 * @project headfirst-designpattern
 */
public class SoldState implements State {
    private GumballMachine gumballMachine;

    public SoldState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
    }

    @Override
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    @Override
    public void refill() {
    }

    @Override
    public String toString() {
        return "dispensing a gumball";
    }
}
