package com.example.taylorinsurance.ui.home_insurance;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import com.example.taylorinsurance.R;

public class HomeInsuranceQuoteForm extends Fragment {


    private HomeInsuranceQuoteFormViewModel homeInsuranceQuoteFormViewModel;
    private Button getQuote;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        homeInsuranceQuoteFormViewModel =
                new ViewModelProvider(this).get(HomeInsuranceQuoteFormViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home_insurance_quote_form, container, false);
        final TextView textView = root.findViewById(R.id.tvGetAutoQuote);
        homeInsuranceQuoteFormViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        getQuote = root.findViewById(R.id.btnSubmit);
        getQuote.setOnClickListener(view -> Navigation.findNavController(view).navigate(R.id.getHomequote));
        return root;
    }
}