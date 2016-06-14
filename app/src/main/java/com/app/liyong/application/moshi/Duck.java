package com.app.liyong.application.moshi;

/**
 * Created by Administrator on 2016/5/26.
 */
public abstract class Duck {
    public FlyBehavior mFlyBehavior;
    public QuackBehavior mQuackBehavior;

    public  Duck(){

    }

    public  void  fly(){
        mFlyBehavior.fly();
    }
    public void  quack(){
        mQuackBehavior.quack();
    }
    public void setFlyBehavior(FlyBehavior mFlyBehavior){
        this.mFlyBehavior = mFlyBehavior;
    }
    public void setQuackBehavior(QuackBehavior mQuackBehavior){
        this.mQuackBehavior = mQuackBehavior;
    }

}
