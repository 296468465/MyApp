package com.app.liyong.application.moshi;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2016/6/4.
 */
public class DataBean implements Serializable {
    private   List<PeopleBean>  strData  ;
    // PeopleBean 是你用的存放人的数据


    public List<PeopleBean> getStrData() {
        return strData;
    }

    public void setStrData(List<PeopleBean> strData) {
        this.strData = strData;
    }
}
