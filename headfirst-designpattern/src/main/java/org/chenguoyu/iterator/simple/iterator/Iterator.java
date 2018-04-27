package org.chenguoyu.iterator.simple.iterator;

import org.chenguoyu.iterator.simple.menu.MenuItem;

/**
 * @author chenguoyu
 * @date 2018/4/23 0023
 */
public interface Iterator<T> {
    boolean hasNext();

    MenuItem next();
}
