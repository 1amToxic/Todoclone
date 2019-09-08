package com.example.demo.todoclone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;

import com.example.demo.todoclone.fragments.BaseFragment;
import com.example.demo.todoclone.fragments.MainFragment;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction().add(R.id.fragmentAdapter,new MainFragment()).commit();
    }

    @Override
    public void onBackPressed() {
        BaseFragment fragment = (BaseFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentAdapter);
        if(getSupportFragmentManager().getBackStackEntryCount()!=0){
            fragment.onBackPress();
        }
        else{
            //super.onBackPressed();
            finish();
    }
        super.onBackPressed();
    }
}
