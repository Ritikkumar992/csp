package com.example.customer_support_app.Fragment.PageFragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.customer_support_app.Adapter.ProjectItemAdapter;
import com.example.customer_support_app.EndPoints.Api;
import com.example.customer_support_app.Model.ProjectItemModel;
import com.example.customer_support_app.Network.RetrofitClient;
import com.example.customer_support_app.ProjectData.ProjectData;
import com.example.customer_support_app.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class PageFragment2 extends Fragment {

    RecyclerView recyclerView;
    ProjectItemAdapter adapter;
    ArrayList<ProjectItemModel> projectItemModelsArr = new ArrayList<>();

    DatabaseReference database;

    public PageFragment2() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_page2, container, false);

        recyclerView = root.findViewById(R.id.recyclerViewPageFragment2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        //================================= Fetching data from API =========================//
        Call<List<ProjectItemModel>> call = new RetrofitClient().getRetrofitInstance().create(Api.class).getProjects("Admin","auth0|660ea1d651aa90d60be5a6bd");
        call.enqueue(new Callback<List<ProjectItemModel>>() {
            @Override
            public void onResponse(Call<List<ProjectItemModel>> call, Response<List<ProjectItemModel>> response) {

                List<ProjectItemModel> projectDataList = response.body();
                if (response.isSuccessful() && !projectDataList.isEmpty()) {

                    recyclerView = root.findViewById(R.id.recyclerViewPageFragment2);
                    recyclerView.setHasFixedSize(true);
                    recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
                    adapter = new ProjectItemAdapter(requireContext(), projectDataList);
                    recyclerView.setAdapter(adapter);
                } else {
                    Log.e("ERROR", response.message());
                }
            }
            @Override
            public void onFailure(Call<List<ProjectItemModel>> call, Throwable t) {
                Log.e("ERROR", t.getMessage());
            }
        });
        return root;
    }
}