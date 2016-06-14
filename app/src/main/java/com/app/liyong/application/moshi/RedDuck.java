package com.app.liyong.application.moshi;

/**
 * Created by Administrator on 2016/5/26.
 */
public class RedDuck extends Duck {
    public  RedDuck(){
        mFlyBehavior = new BadFlyBehavior();
        mQuackBehavior = new GaGaQuackBehavior();
    }
}
