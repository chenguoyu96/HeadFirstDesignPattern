package org.chenguoyu.adapter;

import org.chenguoyu.adapter.duck.Duck;
import org.chenguoyu.adapter.turkey.Turkey;

/**
 * 1. 首先，你需要实现想要转换成的类型接口，也就是你的客户所期望看到的接口
 *
 * @author chenguoyu
 * @date 2018-04-15
 * @project headfirst-designpattern
 */
public class TurkeyAdapter implements Duck {
    private Turkey turkey;

    /**
     * 2. 接着，需要取得适配的对象引用，这里我们利用构造器取得这个引用
     *
     * @param turkey
     */
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    /**
     * 现在我们需要实现接口中的所有方法。quack在内之间的转换很简单，只需要调用gobble就好了
     */
    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }
}
