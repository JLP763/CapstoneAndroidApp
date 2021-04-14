package com.example.taylorinsurance.ui.auto_insurance;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.taylorinsurance.R;
import com.example.taylorinsurance.ui.home_insurance.HomeInsuranceQuoteFormViewModel;

public class AutoInsuranceQuoteForm extends Fragment {

    private AutoInsuranceQuoteFormViewModel autoInsuranceQuoteFormViewModel;
    private Button getQuote;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        autoInsuranceQuoteFormViewModel =
                new ViewModelProvider(this).get(AutoInsuranceQuoteFormViewModel.class);
        View root = inflater.inflate(R.layout.fragment_auto_insurance_quote_form, container, false);
        final TextView textView = root.findViewById(R.id.tvGetAutoQuote);
        autoInsuranceQuoteFormViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        getQuote = root.findViewById(R.id.btnSubmit);
        getQuote.setOnClickListener(view -> Navigation.findNavController(view).navigate(R.id.getAutoQuote));
        return root;
    }
}