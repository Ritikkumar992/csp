package com.example.customer_support_app.Fragment.PageFragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.customer_support_app.Adapter.ProjectItemAdapter;
import com.example.customer_support_app.Model.ProjectItemModel;
import com.example.customer_support_app.ProjectData.ProjectData;
import com.example.customer_support_app.R;

import java.util.ArrayList;


public class PageFragment4 extends Fragment {

    RecyclerView recyclerView;
    ArrayList<ProjectItemModel> projectItemArr = new ArrayList<>();

    public PageFragment4() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_page4, container, false);

        recyclerView = root.findViewById(R.id.recyclerViewPageFragment4);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        //================================= Fetching data from API ========================= //
        return root;
    }
}