package com.example.myapplication.NONFCV.Motihari.MInfra.MVarieties.MGap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.NONFCV.Jati.JInfra.JVarieties.JGap.JGapActivity;
import com.example.myapplication.NONFCV.Jati.JInfra.JVarieties.JGap.JInfraActivity;
import com.example.myapplication.NONFCV.Jati.JInfra.JVarieties.JGap.JVarietiesActivity;
import com.example.myapplication.NONFCV.Jati.JInfra.JVarieties.JGap.JWestBengalActivity;
import com.example.myapplication.R;

public class MWestBengalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mwest_bengal);


        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);
        Button b3=(Button) findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MWestBengalActivity.this, MInfraActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MWestBengalActivity.this, MVarietiesActivity.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(MWestBengalActivity.this, MGapActivity.class);
                startActivity(intent);
            }
        });
    }
}