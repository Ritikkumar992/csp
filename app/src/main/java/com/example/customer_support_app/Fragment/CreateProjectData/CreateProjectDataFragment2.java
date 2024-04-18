package com.example.customer_support_app.Fragment.CreateProjectData;


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
import com.example.customer_support_app.Firebase.FirebaseResourse;
import com.example.customer_support_app.Model.CreateProjectViewModel;
import com.example.customer_support_app.R;

public class CreateProjectDataFragment2 extends Fragment {
    FirebaseResourse firebaseResourse = new FirebaseResourse();

    EditText clientNameView, clientEmailView;
    TextView addClient,backBtn, continueBtn;
    private CreateProjectViewModel viewModel;
    public CreateProjectDataFragment2() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewModel = new ViewModelProvider(requireActivity()).get(CreateProjectViewModel.class);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root =  inflater.inflate(R.layout.fragment_create_project_data2, container, false);


        clientNameView = root.findViewById(R.id.clientNameId);
        clientEmailView = root.findViewById(R.id.clientEmailId);
        addClient = root.findViewById(R.id.addClient);
        continueBtn = root.findViewById(R.id.sendBtnInviteClient);
        backBtn = root.findViewById(R.id.backBtnInviteClient);


        clientNameView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
            @Override
            public void afterTextChanged(Editable s) {
                viewModel.setClientName(s.toString()); // Update client name in ViewModel
            }
        });
        clientEmailView.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }
            @Override
            public void afterTextChanged(Editable s) {
                viewModel.setClientEmail(s.toString());
            }
        });

        addClient.setOnClickListener(v->{
            navigateNext();
        });
        continueBtn.setOnClickListener(v->{
            navigateNext();
        });


        backBtn.setOnClickListener(v->{
           navigatePrev();
        });

        return root;
    }
    private void clearAll()
    {
        clientNameView.setText("");
        clientEmailView.setText("");
    }
    private void navigateNext()
    {
        ViewPager2 viewPager = getActivity().findViewById(R.id.create_project_data_viewPager);
        viewPager.setCurrentItem(2, true);
    }
    private void navigatePrev()
    {
        ViewPager2 viewPager = getActivity().findViewById(R.id.create_project_data_viewPager);
        viewPager.setCurrentItem(0, true);
    }
}