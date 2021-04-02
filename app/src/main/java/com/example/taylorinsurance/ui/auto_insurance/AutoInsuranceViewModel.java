package com.example.taylorinsurance.ui.auto_insurance;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AutoInsuranceViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AutoInsuranceViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("With Taylor auto insurance, you get the coverage you need at the right price for you by ensuring you get all the discounts you qualify for!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}