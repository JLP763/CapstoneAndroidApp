package com.example.taylorinsurance.ui.auto_insurance;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AutoInsuranceQuoteFormViewModel extends ViewModel {
    private MutableLiveData<String> mText;


    public AutoInsuranceQuoteFormViewModel() {
        mText = new MutableLiveData<>();
        //mText.setValue();

    }

    public LiveData<String> getText() {
        return mText;
    }
}
