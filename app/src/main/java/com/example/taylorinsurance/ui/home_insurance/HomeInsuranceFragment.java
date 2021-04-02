package com.example.taylorinsurance.ui.home_insurance;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.taylorinsurance.R;

public class HomeInsuranceFragment extends Fragment {

    private HomeInsuranceViewModel homeInsuranceViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeInsuranceViewModel =
                new ViewModelProvider(this).get(HomeInsuranceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home_insurance, container, false);
        final TextView textView = root.findViewById(R.id.text_home_insurance);
        homeInsuranceViewModel.getText().observe(getViewLifecycleOwner(), s -> textView.setText(s));
        return root;
    }
}