package com.example.customer_support_app.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.example.customer_support_app.Fragment.ProjectData.ProjectDataFragment1;
import com.example.customer_support_app.Fragment.ProjectData.ProjectDataFragment2;
import com.example.customer_support_app.Fragment.ProjectData.ProjectDataFragment3;
import com.example.customer_support_app.Fragment.ProjectData.ProjectDataFragment4;
import com.example.customer_support_app.Fragment.ProjectData.ProjectDataFragment5;

public class ViewProjectDataAdapter extends FragmentStateAdapter {

    public ViewProjectDataAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position) {
            case 0:
                return new ProjectDataFragment1();
            case 1:
                return new ProjectDataFragment2();
            case 2:
                return new ProjectDataFragment3();
                case 3:
                return new ProjectDataFragment4();
            default:
                return new ProjectDataFragment5();
        }
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}
