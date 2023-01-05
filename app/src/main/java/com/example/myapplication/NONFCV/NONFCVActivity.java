package com.example.myapplication.NONFCV;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication.FCV.FCVActivity;
import com.example.myapplication.R;
import com.example.myapplication.startup.HomeScreenActivity;

public class NONFCVActivity extends AppCompatActivity {

    AppCompatButton btnTypesOfTobacco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonfcvactivity);

        btnTypesOfTobacco = findViewById(R.id.btn_TypesOfTobacco);

        btnTypesOfTobacco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent( NONFCVActivity.this, TypesOfTobaccoActivity.class);
                startActivity(intent);

            }
        });
    }
}