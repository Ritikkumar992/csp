package com.example.customer_support_app.Fragment.ProjectData;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.customer_support_app.R;

public class ProjectDataFragment4 extends Fragment {
    TextView continueBtn, backBtn;

    public ProjectDataFragment4() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_project_data4, container, false);

        continueBtn = root.findViewById(R.id.continueBtnVersionHistory);
        backBtn = root.findViewById(R.id.backBtnVersionHistory);

        backBtn.setOnClickListener(v->{
            ViewPager2 viewPager = getActivity().findViewById(R.id.project_data_viewPager);
            viewPager.setCurrentItem(2, true);
        });
        continueBtn.setOnClickListener(v->{
            ViewPager2 viewPager = getActivity().findViewById(R.id.project_data_viewPager);
            viewPager.setCurrentItem(4, true);
        });

        return root;
    }
}