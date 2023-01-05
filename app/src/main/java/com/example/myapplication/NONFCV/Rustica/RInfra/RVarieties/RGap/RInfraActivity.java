package com.example.myapplication.NONFCV.Rustica.RInfra.RVarieties.RGap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.NONFCV.Cheroot.ChInfra.ChVarieties.ChGap.ChContactActivity;
import com.example.myapplication.NONFCV.Cheroot.ChInfra.ChVarieties.ChGap.ChInfraActivity;
import com.example.myapplication.NONFCV.Cheroot.ChInfra.ChVarieties.ChGap.ChStationActivity;
import com.example.myapplication.R;

public class RInfraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rinfra);

        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RInfraActivity.this, RStationActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RInfraActivity.this, RContactActivity.class);
                startActivity(intent);
            }
        });
    }
}