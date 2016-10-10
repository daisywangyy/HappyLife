package com.example.wangyy.happylife;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by wangyy on 2016/9/28.
 */
public class Fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // ---Inflate the layout for this fragment---
        return inflater.inflate(R.layout.fragment1, container, false);
    }
}

