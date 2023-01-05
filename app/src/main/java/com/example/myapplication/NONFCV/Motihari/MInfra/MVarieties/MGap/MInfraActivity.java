package com.example.myapplication.NONFCV.Motihari.MInfra.MVarieties.MGap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.NONFCV.Jati.JInfra.JVarieties.JGap.JContactActivity;
import com.example.myapplication.NONFCV.Jati.JInfra.JVarieties.JGap.JInfraActivity;
import com.example.myapplication.NONFCV.Jati.JInfra.JVarieties.JGap.JStationctivity;
import com.example.myapplication.R;

public class MInfraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minfra);


        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MInfraActivity.this, MStationActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MInfraActivity.this, MContactActivity.class);
                startActivity(intent);
            }
        });
    }
}