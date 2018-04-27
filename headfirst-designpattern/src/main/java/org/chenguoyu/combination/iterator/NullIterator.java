package org.chenguoyu.combination.iterator;

import org.chenguoyu.combination.menu.MenuComponent;

import java.util.Iterator;

/**
 * @author chenguoyu
 * @date 2018-04-27
 * @project headfirst-designpattern
 */
public class NullIterator implements Iterator<MenuComponent> {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public MenuComponent next() {
        return null;
    }
}
