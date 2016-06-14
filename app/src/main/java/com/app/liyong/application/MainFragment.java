package com.app.liyong.application;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.FormEncodingBuilder;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.lang.reflect.Method;

import butterknife.ButterKnife;
import okio.BufferedSink;

/**
 * Created by Administrator on 2016/5/19.
 */
public class MainFragment extends BaseFragment {

    private Button mainButton,mains;
    public static MainFragment newInstance(){
        return new MainFragment();
    }
    @Override
    protected void initView(View view, Bundle bundle) {
    mainButton = (Button)view.findViewById(R.id.mainButton);
        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainFragment.this.getHttpData();
            }
        });
    }

    private void getHttpData() {
       //get请求
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder().url("").build();
          Call call =  okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {

            }

            @Override
            public void onResponse(Response response) throws IOException {

            }
        });
        //post请求
        FormEncodingBuilder builder   = new FormEncodingBuilder();
        builder.add("yy","xx");
        Request request2 = new Request.Builder().url("xxxxx").post(builder.build()).build();
      Call call2 =  okHttpClient.newCall(request2);
       
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main;
    }
}
