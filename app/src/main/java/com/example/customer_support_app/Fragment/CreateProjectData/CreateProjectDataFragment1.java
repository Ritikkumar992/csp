package com.example.customer_support_app.Fragment.CreateProjectData;

import com.example.customer_support_app.Firebase.FirebaseResourse;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager2.widget.ViewPager2;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.example.customer_support_app.Model.CreateProjectViewModel;
import com.example.customer_support_app.R;


public class CreateProjectDataFragment1 extends Fragment {
    FirebaseResourse firebaseResourse = new FirebaseResourse();
    TextView continueBtn;
    EditText projectNameView;

    private CreateProjectViewModel viewModel;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(requireActivity()).get(CreateProjectViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View root =  inflater.inflate(R.layout.fragment_create_project_data1, container, false);

        continueBtn = root.findViewById(R.id.continueBtnProjectName);
        projectNameView = root.findViewById(R.id.projectNameId);

        projectNameView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
            @Override
            public void afterTextChanged(Editable name) {
                viewModel.setProjectName(name.toString());
            }
        });

        continueBtn.setOnClickListener(v->{
            navigateNext();
        });
        return root;
    }
    private void navigateNext()
    {
        ViewPager2 viewPager = getActivity().findViewById(R.id.create_project_data_viewPager);
        viewPager.setCurrentItem(1, true);
    }

}