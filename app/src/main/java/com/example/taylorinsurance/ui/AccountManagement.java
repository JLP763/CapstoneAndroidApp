package com.example.taylorinsurance.ui;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.taylorinsurance.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class AccountManagement extends Fragment {

    private AccountManagementViewModel accountManagementViewModel;
    private FloatingActionButton viewHomePolicy;
    private FloatingActionButton viewAutoPolicy;

    public static AccountManagement newInstance() {
        return new AccountManagement();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        accountManagementViewModel =
                new ViewModelProvider(this).get(AccountManagementViewModel.class);
        View root = inflater.inflate(R.layout.account_management_fragment, container, false);
        final TextView textView = root.findViewById(R.id.tvAccountManagement);
        accountManagementViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        viewAutoPolicy = root.findViewById(R.id.fabActiveCar);
        viewAutoPolicy.setOnClickListener(view -> Navigation.findNavController(view).navigate(R.id.viewautopolicy));

        viewHomePolicy = root.findViewById(R.id.fabActiveHouse);
        viewHomePolicy.setOnClickListener(view -> Navigation.findNavController(view).navigate(R.id.viewhomepolicy));
        return root;
    }
}