package com.app.liyong.application.moshi;

/**
 * Created by Administrator on 2016/5/26.
 */
public class BadFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("_badfly_");
    }
}
