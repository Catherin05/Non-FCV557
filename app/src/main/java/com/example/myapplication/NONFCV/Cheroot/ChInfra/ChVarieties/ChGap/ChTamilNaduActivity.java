package com.example.myapplication.NONFCV.Cheroot.ChInfra.ChVarieties.ChGap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.NONFCV.Burley.AP.APInfra.APVarieties.APGap.APActivity;
import com.example.myapplication.NONFCV.Burley.AP.APInfra.APVarieties.APGap.APGapActivity;
import com.example.myapplication.NONFCV.Burley.AP.APInfra.APVarieties.APGap.APRInfraActivity;
import com.example.myapplication.NONFCV.Burley.AP.APInfra.APVarieties.APGap.APVarietiesActivity;
import com.example.myapplication.R;

public class ChTamilNaduActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_tamil_nadu);


        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);
        Button b3=(Button) findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ChTamilNaduActivity.this, ChInfraActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ChTamilNaduActivity.this, ChVarietiesActivity.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ChTamilNaduActivity.this, ChGapActivity.class);
                startActivity(intent);
            }
        });
    }
}