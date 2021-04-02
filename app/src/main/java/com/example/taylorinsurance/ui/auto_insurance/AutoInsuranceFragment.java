package com.example.taylorinsurance.ui.auto_insurance;

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

public class AutoInsuranceFragment extends Fragment {

    private AutoInsuranceViewModel autoInsuranceViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        autoInsuranceViewModel =
                new ViewModelProvider(this).get(AutoInsuranceViewModel.class);
        View root = inflater.inflate(R.layout.fragment_auto_insurance, container, false);
        final TextView textView = root.findViewById(R.id.text_auto_insurance);
        autoInsuranceViewModel.getText().observe(getViewLifecycleOwner(), s -> textView.setText(s));
        return root;
    }
}