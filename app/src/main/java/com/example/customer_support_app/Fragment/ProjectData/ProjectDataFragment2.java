package com.example.customer_support_app.Fragment.ProjectData;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.customer_support_app.R;

public class ProjectDataFragment2 extends Fragment {
    TextView continueBtn,backBtn;
    public ProjectDataFragment2() {

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_projecet_data2, container, false);

        continueBtn = root.findViewById(R.id.continueBtnScopeStack);
        backBtn = root.findViewById(R.id.backBtnScopeStack);

        backBtn.setOnClickListener(v->{
            ViewPager2 viewPager = getActivity().findViewById(R.id.project_data_viewPager);
            viewPager.setCurrentItem(0, true);
        });
        continueBtn.setOnClickListener(v->{
            ViewPager2 viewPager = getActivity().findViewById(R.id.project_data_viewPager);
            viewPager.setCurrentItem(2, true);
        });


        Spinner spinner = root.findViewById(R.id.spinnerId);
        String[] items = {"Backend", "Front end", "Mobile App", "Database"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(requireContext(),
                android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        return root;

    }
}