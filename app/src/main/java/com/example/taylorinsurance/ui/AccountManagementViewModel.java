package com.example.taylorinsurance.ui;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AccountManagementViewModel extends ViewModel {
    private MutableLiveData<String> mText;


    public AccountManagementViewModel() {
        mText = new MutableLiveData<>();
        //mText.setValue();

    }

    public LiveData<String> getText() {
        return mText;
    }
}