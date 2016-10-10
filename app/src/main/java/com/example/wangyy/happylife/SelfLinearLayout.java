package com.example.wangyy.happylife;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

/**
 * Created by wangyy on 2016/10/10.
 */
public class SelfLinearLayout extends LinearLayout {
    public SelfLinearLayout(Context context) {
        super(context);
    }

    public SelfLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SelfLinearLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                return false;
        }
        return super.onTouchEvent(event);
    }
}
