package com.app.liyong.application.moshi;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BActivity extends AppCompatActivity {

     public static void newInstance(AActivity activity){
         Intent intent     =    new Intent(activity,BActivity.class);
         activity.startActivity(intent);
     }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }
}
