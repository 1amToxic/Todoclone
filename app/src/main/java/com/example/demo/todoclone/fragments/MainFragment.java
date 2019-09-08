package com.example.demo.todoclone.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.demo.todoclone.R;
public class MainFragment extends BaseFragment {
    private View btnMyDate;

    public MainFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        btnMyDate = view.findViewById(R.id.btnMyDate);
        btnMyDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToMyDateFragment();
            }
        });
        return view;
    }
    private void goToMyDateFragment() {
        addFragment(new MyDateFragment());
    }


}
