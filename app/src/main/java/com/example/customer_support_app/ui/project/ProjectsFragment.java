package com.example.customer_support_app.ui.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import com.example.customer_support_app.Adapter.ViewPagerMessengerAdapter;
import com.example.customer_support_app.R;
import com.example.customer_support_app.createProject.createProjectActivity;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class ProjectsFragment extends Fragment {
    TextView createProjectBtn;
    private final String[] titles = {"All Projects", "In Progress", "Completed", "Hold"};

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_projects, container, false);

        createProjectBtn = root.findViewById(R.id.create_project_id);
        createProjectBtn.setOnClickListener(v -> {
            Intent iCreateProject = new Intent(requireContext(), createProjectActivity.class);
            startActivity(iCreateProject);
        });

        //------------------------------------ Pager--------------------------------------------//
        TabLayout tabLayout = root.findViewById(R.id.tabLayout);
        ViewPager2 viewPager2 = root.findViewById(R.id.viewPager);

        // accessing ViewPagerMessengerAdapter.java class to attach adapter to fetch data.
        ViewPagerMessengerAdapter adapterClass = new ViewPagerMessengerAdapter(getChildFragmentManager(), getLifecycle());
        viewPager2.setAdapter(adapterClass);

        new TabLayoutMediator(tabLayout, viewPager2, (tab, position) ->{
            tab.setText(titles[position]);
        }).attach();

        return root;
    }
}
