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

public class FragmentTab1 extends Fragment {
    private static final String TAG = "FragmentTab1";

    private Button btn1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab1,container,false);
        btn1=(Button)view.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Testing Tab 1", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
