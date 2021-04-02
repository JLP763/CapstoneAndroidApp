package com.example.taylorinsurance.ui.auto_insurance;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AutoInsuranceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AutoInsuranceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is auto insurance tips fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}