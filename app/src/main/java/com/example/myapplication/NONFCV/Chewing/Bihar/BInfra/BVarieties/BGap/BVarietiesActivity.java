package com.example.myapplication.NONFCV.Chewing.Bihar.BInfra.BVarieties.BGap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.NONFCV.Bidi.Gujarat.GVarieties.A119Activity;
import com.example.myapplication.NONFCV.Bidi.Gujarat.GVarieties.A2Activity;
import com.example.myapplication.NONFCV.Bidi.Gujarat.GVarieties.ABTActivity;
import com.example.myapplication.NONFCV.Bidi.Gujarat.GVarieties.GABTActivity;
import com.example.myapplication.NONFCV.Bidi.Gujarat.GVarieties.GABTHActivity;
import com.example.myapplication.NONFCV.Bidi.Gujarat.GVarieties.GT4Activity;
import com.example.myapplication.NONFCV.Bidi.Gujarat.GVarieties.GT5Activity;
import com.example.myapplication.NONFCV.Bidi.Gujarat.GVarieties.GT7Activity;
import com.example.myapplication.NONFCV.Bidi.Gujarat.GVarieties.GT9Activity;
import com.example.myapplication.NONFCV.Bidi.Gujarat.GVarieties.GTHActivity;
import com.example.myapplication.NONFCV.Bidi.Gujarat.GVarieties.GVarietiesActivity;
import com.example.myapplication.NONFCV.Bidi.Gujarat.GVarieties.MRGTHActivity;
import com.example.myapplication.R;

public class BVarietiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bvarieties);

        Button but1=(Button) findViewById(R.id.button1);
        Button but2=(Button) findViewById(R.id.button2);
        Button but3=(Button) findViewById(R.id.button3);
        Button but4=(Button) findViewById(R.id.button4);
        Button but5=(Button) findViewById(R.id.button5);
        Button but6=(Button) findViewById(R.id.button6);
        Button but7=(Button) findViewById(R.id.button7);


        but1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BVarietiesActivity.this, LICHCHAVIActivity.class);
                startActivity(intent);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BVarietiesActivity.this, VAISHALISPECIALActivity.class);
                startActivity(intent);
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BVarietiesActivity.this, PUSATOBACCO76Activity.class);
                startActivity(intent);
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BVarietiesActivity.this, PRABHAActivity.class);
                startActivity(intent);
            }
        });
        but5.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BVarietiesActivity.this, SONAActivity.class);
                startActivity(intent);
            }
        });
        but6.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BVarietiesActivity.this, GANDAKBAHARActivity.class);
                startActivity(intent);
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BVarietiesActivity.this, DP401Activity.class);
                startActivity(intent);
            }
        });



    }
}