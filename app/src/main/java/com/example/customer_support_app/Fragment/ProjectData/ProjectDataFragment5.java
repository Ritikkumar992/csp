package com.example.customer_support_app.Fragment.ProjectData;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import com.example.customer_support_app.Activity.HomeActivity;
import com.example.customer_support_app.R;

public class ProjectDataFragment5 extends Fragment {

    TextView backBtn, submitBtn;

    public ProjectDataFragment5() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_project_data5, container, false);

        submitBtn = root.findViewById(R.id.submitBtnFiles);
        backBtn = root.findViewById(R.id.backBtnFiles);

        backBtn.setOnClickListener(v->{
            ViewPager2 viewPager = getActivity().findViewById(R.id.project_data_viewPager);
            viewPager.setCurrentItem(3, true);
        });
        submitBtn.setOnClickListener(v->{
            Intent intent = new Intent(requireContext(), HomeActivity.class);
            startActivity(intent);
            Toast.makeText(requireContext(), "Submitted", Toast.LENGTH_SHORT).show();
        });
        return root;
    }
}