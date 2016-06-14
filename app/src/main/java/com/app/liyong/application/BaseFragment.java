package com.app.liyong.application;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2016/5/19.
 */
public abstract class BaseFragment extends Fragment {
    protected BaseActivity mActivity;
    protected abstract void initView(View view, Bundle bundle);

    protected abstract int getLayoutId();
    protected BaseActivity getHoldingActivity(){
        return mActivity;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.mActivity =(BaseActivity)context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
       View view = inflater.inflate(getLayoutId(),container,false);
        initView(view,savedInstanceState);
        return view;

    }
}
