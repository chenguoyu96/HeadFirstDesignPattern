package org.chenguoyu.combination.iterator;

import org.chenguoyu.combination.menu.Menu;
import org.chenguoyu.combination.menu.MenuComponent;

import java.util.Iterator;
import java.util.Stack;

/**
 * @author chenguoyu
 * @date 2018-04-27
 * @project headfirst-designpattern
 */
public class CompositeIterator implements Iterator<MenuComponent> {
    Stack<Iterator> stack = new Stack<>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (!stack.empty()) {
            Iterator iterator = stack.peek();
            if (iterator.hasNext()) {
                return true;
            } else {
                stack.pop();
                return hasNext();
            }
        }
        return false;
    }

    @Override
    public MenuComponent next() {
        if (hasNext()) {
            Iterator iterator = stack.peek();
            MenuComponent component = (MenuComponent) iterator.next();
            if (component instanceof Menu) {
                stack.push(component.createIterator());
            }
            return component;
        }
        return null;
    }
}
