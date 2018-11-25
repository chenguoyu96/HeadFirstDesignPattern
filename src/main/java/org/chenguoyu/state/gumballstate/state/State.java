package org.chenguoyu.state.gumballstate.state;

/**
 * @author chenguoyu
 * @date 2018/4/30 0030
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    void refill();
}
