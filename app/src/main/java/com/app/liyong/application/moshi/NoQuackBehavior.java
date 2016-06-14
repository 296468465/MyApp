package com.app.liyong.application.moshi;

/**
 * Created by Administrator on 2016/5/26.
 */
public class NoQuackBehavior implements QuackBehavior {

    @Override
    public void quack() {
        System.out.print("_noQuack_");
    }
}
