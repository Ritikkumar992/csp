package com.example.customer_support_app.Fragment.ProjectData;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.example.customer_support_app.Adapter.ExcalationMatrixItemAdapter;
import com.example.customer_support_app.Model.ExcalationMatrixItemModel;
import com.example.customer_support_app.R;
import java.util.ArrayList;

public class ProjectDataFragment3 extends Fragment {

    TextView backBtn, continueBtn;
    RecyclerView recyclerView1, recyclerView2, recyclerView3;
    ArrayList<ExcalationMatrixItemModel> excalationMatrixItemModelsArr1 = new ArrayList<>();
    ArrayList<ExcalationMatrixItemModel> excalationMatrixItemModelsArr2 = new ArrayList<>();
    ArrayList<ExcalationMatrixItemModel> excalationMatrixItemModelsArr3 = new ArrayList<>();

    public ProjectDataFragment3() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_project_data3, container, false);

        backBtn = root.findViewById(R.id.backBtnExcalation);
        continueBtn = root.findViewById(R.id.continueBtnExcalation);


        backBtn.setOnClickListener(v->{
            ViewPager2 viewPager = getActivity().findViewById(R.id.project_data_viewPager);
            viewPager.setCurrentItem(1, true);
        });
        continueBtn.setOnClickListener(v->{
            ViewPager2 viewPager = getActivity().findViewById(R.id.project_data_viewPager);
            viewPager.setCurrentItem(3, true);
        });


        //==================== Operational Excalation Matrix================================//

        recyclerView1 = root.findViewById(R.id.recyclerViewExcalationMatrix1);
        recyclerView1.setHasFixedSize(true);
        recyclerView1.setLayoutManager(new LinearLayoutManager(requireContext()));

        //================================= Fetching data from API =========================//
        excalationMatrixItemModelsArr1.add(new ExcalationMatrixItemModel(R.drawable.user_logo, "Ritik kumar",
                "Tech Lead", "3", R.drawable.circle_red));
        excalationMatrixItemModelsArr1.add(new ExcalationMatrixItemModel(R.drawable.user_logo, "Ritik kumar",
                "Tech Lead", "3", R.drawable.circle_red));
        excalationMatrixItemModelsArr1.add(new ExcalationMatrixItemModel(R.drawable.user_logo, "Ritik kumar",
                "Tech Lead", "3", R.drawable.circle_red));


        ExcalationMatrixItemAdapter adapter1 = new ExcalationMatrixItemAdapter(requireContext(), excalationMatrixItemModelsArr1);
        recyclerView1.setAdapter(adapter1);

        //==================== Financial Excalation Matrix================================//
        recyclerView2 = root.findViewById(R.id.recyclerViewExcalationMatrix2);
        recyclerView2.setHasFixedSize(true);
        recyclerView2.setLayoutManager(new LinearLayoutManager(requireContext()));

        //================================= Fetching data from API =========================//
        excalationMatrixItemModelsArr2.add(new ExcalationMatrixItemModel(R.drawable.user_logo, "Abhishek kumar",
                "Sales Lead", "2",R.drawable.circle_green));
        excalationMatrixItemModelsArr2.add(new ExcalationMatrixItemModel(R.drawable.user_logo, "Abhishek kumar",
                "Sales Lead", "2",R.drawable.circle_green));
        excalationMatrixItemModelsArr2.add(new ExcalationMatrixItemModel(R.drawable.user_logo, "Abhishek kumar",
                "Sales Lead", "2",R.drawable.circle_green));


        ExcalationMatrixItemAdapter adapter2 = new ExcalationMatrixItemAdapter(requireContext(), excalationMatrixItemModelsArr2);
        recyclerView2.setAdapter(adapter2);

        //==================== Technical Excalation Matrix================================//
        recyclerView3 = root.findViewById(R.id.recyclerViewExcalationMatrix3);
        recyclerView3.setHasFixedSize(true);
        recyclerView3.setLayoutManager(new LinearLayoutManager(requireContext()));

        //================================= Fetching data from API =========================//
        excalationMatrixItemModelsArr3.add(new ExcalationMatrixItemModel(R.drawable.user_logo, "Shalok kumar",
                "Tech Lead", "1",R.drawable.circle_grey));
        excalationMatrixItemModelsArr3.add(new ExcalationMatrixItemModel(R.drawable.user_logo, "Shalok kumar",
                "Tech Lead", "1",R.drawable.circle_grey));


        ExcalationMatrixItemAdapter adapter3 = new ExcalationMatrixItemAdapter(requireContext(), excalationMatrixItemModelsArr3);
        recyclerView3.setAdapter(adapter3);


        return root;
    }
}