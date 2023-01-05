package com.example.myapplication.NONFCV.NatuPikka.NPInfra.NPVarieties.NpGap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.NONFCV.NatuPikka.NInfra.NVarieties.NGap.BhairaviActivity;
import com.example.myapplication.R;

public class OVarietiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ovarieties);

        Button but1=(Button) findViewById(R.id.button1);



        but1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(OVarietiesActivity.this, GajapatiActivity.class);
                startActivity(intent);
            }
        });

    }
}