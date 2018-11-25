package org.chenguoyu.iterator.example.menu;


import java.util.Iterator;

/**
 * @author chenguoyu
 * @date 2018/4/23 0023
 */
public interface Menu<T> {
    Iterator<T> createIterator();
}
