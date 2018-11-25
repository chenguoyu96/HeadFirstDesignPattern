package org.chenguoyu.observer.push.observer;

/**
 * 订阅者接口
 *
 * @author chenguoyu
 * @date 2018-03-31
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
