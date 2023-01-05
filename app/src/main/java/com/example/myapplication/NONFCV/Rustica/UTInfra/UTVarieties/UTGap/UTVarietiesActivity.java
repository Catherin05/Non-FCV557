package com.example.myapplication.NONFCV.Rustica.UTInfra.UTVarieties.UTGap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.NONFCV.Jati.JInfra.JVarieties.JGap.PodaliActivity;
import com.example.myapplication.R;

public class UTVarietiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_utvarieties);

        Button but1=(Button) findViewById(R.id.button1);
        Button but2=(Button) findViewById(R.id.button2);


        but1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(UTVarietiesActivity.this, ArR27Activity.class);
                startActivity(intent);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(UTVarietiesActivity.this, AzadKanchanActivity.class);
                startActivity(intent);
            }
        });

    }
}