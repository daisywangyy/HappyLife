package com.example.wangyy.happylife;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by wangyy on 2016/9/28.
 */
public class Fragment1 extends Fragment {

    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // ---Inflate the layout for this fragment---
        view =  inflater.inflate(R.layout.fragment2, container, true);
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        // ---Button view---
        Button btnGetText = (Button) getActivity()
                .findViewById(R.id.btnGetText);
        btnGetText.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView lbl = (TextView) getActivity().findViewById(
                        R.id.lblFragment1);
                Toast.makeText(getActivity(), lbl.getText(), Toast.LENGTH_SHORT)
                        .show();
            }
        });

        LinearLayout layout = (LinearLayout) view.findViewById(R.id.btnGetLayout);
        layout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView lbl = (TextView) getActivity().findViewById(
                        R.id.lblFragment1);
                Toast.makeText(getActivity(), lbl.getText(), Toast.LENGTH_SHORT)
                        .show();
            }
        });
    }

}
