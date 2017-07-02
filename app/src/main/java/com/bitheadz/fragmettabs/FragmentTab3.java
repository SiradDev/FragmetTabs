package com.bitheadz.fragmettabs;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

/**
 * Created by ANDROCODER on 02.07.2017..
 */

public class FragmentTab3 extends Fragment {
    private static final String TAG = "FragmentTab3";

    private Button btn3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab3,container,false);
        btn3=(Button)view.findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Testing Tab 3", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
