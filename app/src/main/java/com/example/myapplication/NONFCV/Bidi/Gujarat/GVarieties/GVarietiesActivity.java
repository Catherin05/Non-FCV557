package com.example.myapplication.NONFCV.Bidi.Gujarat.GVarieties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class GVarietiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gvarieties);

        Button but1=(Button) findViewById(R.id.button1);
        Button but2=(Button) findViewById(R.id.button2);
        Button but3=(Button) findViewById(R.id.button3);
        Button but4=(Button) findViewById(R.id.button4);
        Button but5=(Button) findViewById(R.id.button5);
        Button but6=(Button) findViewById(R.id.button6);
        Button but7=(Button) findViewById(R.id.button7);
        Button but8=(Button) findViewById(R.id.button8);
        Button but9=(Button) findViewById(R.id.button9);
        Button but10=(Button) findViewById(R.id.button10);
        Button but11=(Button) findViewById(R.id.button11);

        but1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GVarietiesActivity.this, GABTHActivity.class);
                startActivity(intent);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GVarietiesActivity.this, GABTActivity.class);
                startActivity(intent);
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GVarietiesActivity.this, ABTActivity.class);
                startActivity(intent);
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GVarietiesActivity.this, MRGTHActivity.class);
                startActivity(intent);
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GVarietiesActivity.this, GT9Activity.class);
                startActivity(intent);
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GVarietiesActivity.this, GTHActivity.class);
                startActivity(intent);
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GVarietiesActivity.this, GT7Activity.class);
                startActivity(intent);
            }
        });

        but8.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GVarietiesActivity.this, GT5Activity.class);
                startActivity(intent);
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GVarietiesActivity.this, A2Activity.class);
                startActivity(intent);
            }
        });
        but10.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GVarietiesActivity.this, A119Activity.class);
                startActivity(intent);
            }
        });
        but11.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GVarietiesActivity.this, GT4Activity.class);
                startActivity(intent);
            }
        });


    }
}

