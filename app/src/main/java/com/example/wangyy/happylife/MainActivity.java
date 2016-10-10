package com.example.wangyy.happylife;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;

/**
 * Created by wangyy on 2016/8/22.
 */
public class MainActivity extends FragmentActivity{

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        Log.e("onSaveInstanceState", "onSaveInstanceState");
        super.onSaveInstanceState(outState, outPersistentState);
    }
}
