package com.example.customer_support_app.ui.employee;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class employeeViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public employeeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Employee fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}