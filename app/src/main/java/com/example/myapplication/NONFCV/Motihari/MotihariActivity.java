package com.example.myapplication.NONFCV.Motihari;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.NONFCV.Motihari.MInfra.MVarieties.MGap.MWestBengalActivity;
import com.example.myapplication.R;

public class MotihariActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_motihari);



        Button butt1=(Button) findViewById(R.id.button1);

        butt1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MotihariActivity.this, MWestBengalActivity.class);
                startActivity(intent);
            }
        });
    }
}