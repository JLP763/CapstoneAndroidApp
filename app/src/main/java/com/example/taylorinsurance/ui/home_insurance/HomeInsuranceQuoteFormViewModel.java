package com.example.taylorinsurance.ui.home_insurance;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeInsuranceQuoteFormViewModel extends ViewModel {


        private MutableLiveData<String> mText;


        public HomeInsuranceQuoteFormViewModel() {
            mText = new MutableLiveData<>();
            //mText.setValue();

        }

        public LiveData<String> getText() {
            return mText;
        }



}
