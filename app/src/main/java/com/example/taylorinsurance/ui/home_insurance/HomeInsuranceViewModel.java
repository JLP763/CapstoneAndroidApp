package com.example.taylorinsurance.ui.home_insurance;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeInsuranceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HomeInsuranceViewModel() {
        mText = new MutableLiveData<>();
        //mText.setValue();
    }

    public LiveData<String> getText() {
        return mText;
    }
}