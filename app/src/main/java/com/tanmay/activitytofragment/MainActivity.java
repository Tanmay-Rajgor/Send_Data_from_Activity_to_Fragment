package com.tanmay.activitytofragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    EditText weight, height;
    Button calculate;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        Myfirstfragment myfirstfragment = new Myfirstfragment();

        weight = findViewById(R.id.editTextWeight);
        height = findViewById(R.id.editTextHeight);
        calculate = findViewById(R.id.button);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                int userWeight = Integer.valueOf(weight.getText().toString());
                int userHeight = Integer.valueOf(height.getText().toString());

                bundle.putInt("weight", userWeight);
                bundle.putInt("height", userWeight);

                myfirstfragment.setArguments(bundle);
                fragmentTransaction.add(R.id.frame, myfirstfragment);
                fragmentTransaction.commit();
            }
        });
    }
}