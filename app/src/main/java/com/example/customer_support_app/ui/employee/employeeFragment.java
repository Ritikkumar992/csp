package com.example.customer_support_app.ui.employee;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.customer_support_app.databinding.FragmentEmployeeBinding;

public class employeeFragment extends Fragment {

    private FragmentEmployeeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        employeeViewModel slideshowViewModel =
                new ViewModelProvider(this).get(employeeViewModel.class);

        binding = FragmentEmployeeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textProjectManager;
        slideshowViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}