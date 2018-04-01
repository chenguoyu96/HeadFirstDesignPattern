package org.chenguoyu.observer.push.subject;

import org.chenguoyu.observer.push.observer.Observer;

/**
 * 主题接口
 *
 * @author chenguoyu
 * @date 2018-03-31
 */
public interface Subject {
    /**
     * 注册观察者
     *
     * @param o 观察者
     */
    void registerObserver(Observer o);

    /**
     * 删除观察者
     *
     * @param o 观察者
     */
    void removeObserver(Observer o);

    /**
     * 通知所有观察者
     */
    void notifyObservers();
}
