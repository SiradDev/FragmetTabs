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

public class FragmentTab2 extends Fragment {
    private static final String TAG = "FragmentTab2";

    private Button btn2;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab2,container,false);
        btn2=(Button)view.findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(),"Testing Tab 2", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }
}
