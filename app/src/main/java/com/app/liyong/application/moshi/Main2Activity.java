package com.app.liyong.application.moshi;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.app.liyong.application.MainActivity;
import com.app.liyong.application.R;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {
    private ListView mlistview;
    List<PeopleBean>  middleList;//中间集合
    Button btn_1;
    private List<PeopleBean> mlists;
    private String[] items = {"张三","李四","张fdg三","李dg四","王八fd",
            "田七df","王八","田七","哈啊哈","的广泛的思考过","jfdsk","dsg",
            "ds","sdg","sdg","sdg","erh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mlistview = (ListView)  findViewById(R.id.lv_list);
        btn_1 = (Button) findViewById(R.id.btn_1);//跳转按键
        mlists = new ArrayList<PeopleBean>();//原始数据集合
        for (int i = 0; i < items.length; i++) {
            PeopleBean mPeopleBean =  new PeopleBean();
            mPeopleBean.setName("名字："+i);
            mPeopleBean.setAge("年龄："+i);
            mlists.add(mPeopleBean);
        }
        middleList  = new ArrayList<PeopleBean>();//进入界面创建中间集合   用于存放这个界面被选中的数据
        mlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
             // 1  //点击item了  判断这个item 是否被选中
                if(!false){//点击前没有选中 点击后选中了  将这个人的名字传递到中间集合中去
                    PeopleBean  selectedPeopleBean  =      mlists.get(position);
                    // 把selectedName添加到中间集合中去
                    if (!middleList.contains(selectedPeopleBean)){//保险 起见 判断这个集合中是否有selectedName 这个数据.没有就存
                        middleList.add(selectedPeopleBean);
                    }
                }
            //2 如果是选中的 就要讲这个数据从集合中移除
                if (true){
                    PeopleBean  selectedPeopleBean  =      mlists.get(position);
                    if (middleList.contains(selectedPeopleBean)){//保险 起见 判断这个集合中是否有selectedName 这个数据. 有 就删除
                        middleList.remove(selectedPeopleBean);
                    }
                }
                //item 点击事件处理完成

            }
        });
        //跳转到下一个界面的按键监听
        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //获取中间集合的数据  传递给下一个界面
                //middleList 判断是不是空  空可能不跳转
                Intent intent =      new     Intent(Main2Activity.this,MainActivity.class);
                DataBean mDataBean =       new DataBean();
                  mDataBean.setStrData(middleList);
                intent.putExtra("dataKey",mDataBean);
                startActivity(intent);
            }
        });

    }
    class CantactsAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return mlists.size();
        }

        @Override
        public Object getItem(int position) {
            return mlists.get(position);
        }

        @Override
        public long getItemId(int position) {
            return  position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            TextView textView  =            new TextView(Main2Activity.this);
           PeopleBean  name =       mlists.get(position);
        textView.setText(name.getName());
            textView.setTextSize(20);
            return textView;
        }
    }
}
