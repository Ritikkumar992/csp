package com.example.customer_support_app.ui.project_manager;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProjectManagerViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public ProjectManagerViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Project Manager Fragment.");
    }

    public LiveData<String> getText() {
        return mText;
    }
}