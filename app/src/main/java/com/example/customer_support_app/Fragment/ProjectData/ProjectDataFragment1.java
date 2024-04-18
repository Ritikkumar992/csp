package com.example.customer_support_app.Fragment.ProjectData;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.customer_support_app.R;

public class ProjectDataFragment1 extends Fragment {
    public ProjectDataFragment1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root =  inflater.inflate(R.layout.fragment_project_data1, container, false);

        TextView continueBtn = root.findViewById(R.id.continueBtnProjectOverView);

        continueBtn.setOnClickListener(v->{
            ViewPager2 viewPager = getActivity().findViewById(R.id.project_data_viewPager);
            viewPager.setCurrentItem(1, true);
        });
        return root;
    }
}