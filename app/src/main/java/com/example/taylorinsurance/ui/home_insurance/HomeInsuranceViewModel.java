package com.example.taylorinsurance.ui.home_insurance;

import android.view.View;

import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.taylorinsurance.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

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