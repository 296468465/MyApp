package com.app.liyong.application.moshi;

/**
 * Created by Administrator on 2016/5/26.
 */
public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("_noFLY");
    }
}
