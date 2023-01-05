package com.example.myapplication.NONFCV.Rustica.RInfra.RVarieties.RGap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.R;

public class RGVarietiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rgvarieties);

        Button but1=(Button) findViewById(R.id.button1);
        Button but2=(Button) findViewById(R.id.button2);
        Button but3=(Button) findViewById(R.id.button3);
        Button but4=(Button) findViewById(R.id.button4);
        Button but5=(Button) findViewById(R.id.button5);


        but1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RGVarietiesActivity.this, GCT5Activity.class);
                startActivity(intent);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RGVarietiesActivity.this, DCT4Activity.class);
                startActivity(intent);
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RGVarietiesActivity.this, GCT3Activity.class);
                startActivity(intent);
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RGVarietiesActivity.this, GCT2Activity.class);
                startActivity(intent);
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RGVarietiesActivity.this, GC1Activity.class);
                startActivity(intent);
            }
        });


    }
}