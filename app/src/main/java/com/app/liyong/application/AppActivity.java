package com.app.liyong.application;


import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;

public abstract class AppActivity extends BaseActivity {

    protected abstract Fragment getFirstFragment();
    protected  void handleIntent(Intent intent){};

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(getContentViewId());
        if (null!=getIntent()){
            handleIntent(getIntent());
        }
        if (null==getSupportFragmentManager().getFragments()){
          Fragment firstFragment =  getFirstFragment();
            if(null!=firstFragment){
                addFragment(firstFragment);
            }
        }
    }

    @Override
    protected int getContentViewId() {
        return R.layout.activity_base;
    }

    @Override
    protected int getFragmentContentId() {
        return R.id.fragment_container;
    }
}
