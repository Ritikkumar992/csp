package com.example.customer_support_app.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.example.customer_support_app.Fragment.PageFragment.PageFragment1;
import com.example.customer_support_app.Fragment.PageFragment.PageFragment2;
import com.example.customer_support_app.Fragment.PageFragment.PageFragment3;
import com.example.customer_support_app.Fragment.PageFragment.PageFragment4;


public class ViewPagerMessengerAdapter extends FragmentStateAdapter {

    public ViewPagerMessengerAdapter(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle) {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        switch (position) {
            case 0:
                return new PageFragment1();
            case 1:
                return new PageFragment2();
            case 2:
                return new PageFragment3();
            default:
                return new PageFragment4();
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
