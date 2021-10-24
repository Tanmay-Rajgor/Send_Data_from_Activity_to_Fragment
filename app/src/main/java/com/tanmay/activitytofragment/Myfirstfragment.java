package com.tanmay.activitytofragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Myfirstfragment extends Fragment {

     TextView result;

    public Myfirstfragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_myfirstfragment, container, false);

        result = view.findViewById(R.id.result);

        Bundle bundle = getArguments();
        int userWeight = bundle.getInt("weight");
        int userHeight = bundle.getInt("height");

        double userBmi = (userWeight * 1000) /  (userHeight * userHeight);
        result.setText("Your BMI is :" + userBmi);
        return view;

    }
}