package com.example.myapplication.FCV;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class FCVActivity extends AppCompatActivity {

    Button FCVAPP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fcvactivity);

        FCVAPP=findViewById(R.id.FCV_APP);

        FCVAPP.setOnClickListener(view -> gotoUrl());

    }

    private void gotoUrl() {
        Uri uri=Uri.parse("https://play.google.com/store/apps/details?id=com.icar.ctri");
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}