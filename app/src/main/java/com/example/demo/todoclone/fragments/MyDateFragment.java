package com.example.demo.todoclone.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

import com.example.demo.todoclone.R;
import com.example.demo.todoclone.utils.KeyBoard;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.security.Key;

/**
 * A simple {@link Fragment} subclass.
 */
public class MyDateFragment extends BaseFragment {

    private FloatingActionButton btnAdd;
    private View layoutAddTask;
    private EditText editText;

    public MyDateFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_date, container, false);
        btnAdd = view.findViewById(R.id.add_task);
        layoutAddTask = view.findViewById(R.id.layout_add_task);
        editText = view.findViewById(R.id.edit_text);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hideAddButton();
                showLayoutAddTask();
            }
        });
        return view;
    }

    public void hideAddButton() {
        btnAdd.hide();
    }
    public void showAddButton() {
        btnAdd.show();
    }
    public void hideLayoutAddTask() {

        layoutAddTask.setVisibility(View.INVISIBLE);
        KeyBoard.closeKeyboard(getContext());
    }
    public void showLayoutAddTask() {
        layoutAddTask.setVisibility(View.VISIBLE);
        editText.requestFocus();
        KeyBoard.showKeyboard(getContext());
    }
}
