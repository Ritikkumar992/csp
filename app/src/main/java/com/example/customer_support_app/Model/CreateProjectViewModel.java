package com.example.customer_support_app.Model;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CreateProjectViewModel extends ViewModel {
    private MutableLiveData<String> projectNameLiveData = new MutableLiveData<>();
    private MutableLiveData<String> clientNameLiveData = new MutableLiveData<>();
    private MutableLiveData<String> clientEmailLiveData = new MutableLiveData<>();


    public LiveData<String> getProjectNameLiveData() {
        return projectNameLiveData;
    }
    public void setProjectName(String name) {
        projectNameLiveData.setValue(name);
    }

    public LiveData<String> getClientNameLiveData() {
        return clientNameLiveData;
    }
    public void setClientName(String name) {
        clientNameLiveData.setValue(name);
    }

    public LiveData<String> getClientEmailLiveData() {
        return clientEmailLiveData;
    }

    public void setClientEmail(String email) {
        clientEmailLiveData.setValue(email);
    }

}
