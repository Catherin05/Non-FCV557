package com.example.myapplication.startup;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.example.myapplication.FCV.FCVActivity;
import com.example.myapplication.NONFCV.NONFCVActivity;
import com.example.myapplication.R;

public class HomeScreenActivity<onClick> extends AppCompatActivity {

    AppCompatButton btnFCV;
    AppCompatButton btnNONFCV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        btnFCV = findViewById(R.id.btn_FCV);
        btnNONFCV = findViewById(R.id.btn_NONFCV);

        btnFCV.setOnClickListener(new View.OnClickListener() {
            private Intent packageContext;

            @Override
            public void onClick(View v) {

                Intent intent = new Intent( HomeScreenActivity.this,FCVActivity.class);
                startActivity(intent);
            }
        });

        btnNONFCV.setOnClickListener(new View.OnClickListener() {
            private Intent packageContext;

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(HomeScreenActivity.this,NONFCVActivity.class);
                startActivity(intent);


            }
        });
    }


}
