package org.chenguoyu.adapter;

import org.chenguoyu.adapter.duck.Duck;
import org.chenguoyu.adapter.duck.impl.MallardDuck;
import org.chenguoyu.adapter.turkey.impl.WildTurkey;

/**
 * @author chenguoyu
 * @date 2018-04-15
 * @project headfirst-designpattern
 */
public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();

        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says ...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says ...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says ...");
        testDuck(turkeyAdapter);
    }

    private static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
