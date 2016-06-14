package com.app.liyong.application;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.app.liyong.application.moshi.DataBean;
import com.app.liyong.application.moshi.PeopleBean;
import com.google.gson.Gson;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {
    List<PeopleBean> strData;
    @Nullable
    @Override
    public View onCreateView(String name, Context context, AttributeSet attrs) {
        //获取传递过来的数据
        if (null!=getIntent()){
            DataBean mDataBean =    (DataBean) getIntent().getSerializableExtra("dataKey");
            strData =    mDataBean.getStrData();
//            strData 这个数据就是你要的数据
        }

        return super.onCreateView(name, context, attrs);



    }
}
