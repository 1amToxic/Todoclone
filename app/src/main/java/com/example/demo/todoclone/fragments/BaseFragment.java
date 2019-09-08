package com.example.demo.todoclone.fragments;

import android.widget.BaseAdapter;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.demo.todoclone.R;

public class BaseFragment extends Fragment {
    public void addFragment(BaseFragment fragment){
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.addToBackStack(null);
        transaction.add(R.id.fragmentAdapter,fragment);
        transaction.commit();
    }

    public void onBackPress() {
        getFragmentManager().popBackStack();
    }
}
