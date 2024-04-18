package com.example.customer_support_app.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.customer_support_app.Fragment.CreateProjectData.CreateProjectDataFragment1;
import com.example.customer_support_app.Fragment.CreateProjectData.CreateProjectDataFragment2;
import com.example.customer_support_app.Fragment.CreateProjectData.CreateProjectDataFragment3;

public class createProjectDataAdapter extends FragmentStateAdapter{

    public createProjectDataAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new CreateProjectDataFragment1();
            case 1:
                return new CreateProjectDataFragment2();
            default:
                return new CreateProjectDataFragment3();
        }
    }
    @Override
    public int getItemCount() {
        return 3;
    }
}
