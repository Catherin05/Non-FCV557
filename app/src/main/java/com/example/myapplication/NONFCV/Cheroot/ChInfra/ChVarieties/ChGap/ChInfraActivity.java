package com.example.myapplication.NONFCV.Cheroot.ChInfra.ChVarieties.ChGap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.NONFCV.Burley.AP.APInfra.APVarieties.APGap.APContactActivity;
import com.example.myapplication.NONFCV.Burley.AP.APInfra.APVarieties.APGap.APRInfraActivity;
import com.example.myapplication.NONFCV.Burley.AP.APInfra.APVarieties.APGap.APStationActivity;
import com.example.myapplication.R;

public class ChInfraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_infra);


        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ChInfraActivity.this, ChStationActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ChInfraActivity.this, ChContactActivity.class);
                startActivity(intent);
            }
        });
    }
}