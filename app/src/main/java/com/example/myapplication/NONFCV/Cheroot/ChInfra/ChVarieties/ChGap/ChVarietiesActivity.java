package com.example.myapplication.NONFCV.Cheroot.ChInfra.ChVarieties.ChGap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.NONFCV.Burley.AP.APInfra.APVarieties.APGap.APVarietiesActivity;
import com.example.myapplication.NONFCV.Burley.AP.APInfra.APVarieties.APGap.BanketActivity;
import com.example.myapplication.NONFCV.Burley.AP.APInfra.APVarieties.APGap.Burley21Activity;
import com.example.myapplication.NONFCV.Burley.AP.APInfra.APVarieties.APGap.HdbrgActivity;
import com.example.myapplication.NONFCV.Burley.AP.APInfra.APVarieties.APGap.YBActivity;
import com.example.myapplication.R;

public class ChVarietiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch_varieties);


        Button but1=(Button) findViewById(R.id.button1);
        Button but2=(Button) findViewById(R.id.button2);
        Button but3=(Button) findViewById(R.id.button3);



        but1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ChVarietiesActivity.this, SangamiActivity.class);
                startActivity(intent);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ChVarietiesActivity.this, SendarapattyActivity.class);
                startActivity(intent);
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ChVarietiesActivity.this, BhavaniActivity.class);
                startActivity(intent);
            }
        });

    }
}