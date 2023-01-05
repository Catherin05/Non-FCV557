package com.example.myapplication.NONFCV.Burley.AP.APInfra.APVarieties.APGap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.NONFCV.Bidi.Karnataka.KInfra.Kvarieties.KGap.KFCMActivity;
import com.example.myapplication.NONFCV.Bidi.Karnataka.KInfra.Kvarieties.KGap.KGapActivity;
import com.example.myapplication.NONFCV.Bidi.Karnataka.KInfra.Kvarieties.KGap.KMarketActivity;
import com.example.myapplication.NONFCV.Bidi.Karnataka.KInfra.Kvarieties.KGap.KNMActivity;
import com.example.myapplication.NONFCV.Bidi.Karnataka.KInfra.Kvarieties.KGap.KPHMActivity;
import com.example.myapplication.NONFCV.Bidi.Karnataka.KInfra.Kvarieties.KGap.KSCActivity;
import com.example.myapplication.R;

public class APGapActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apgap);

        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);
        Button b3=(Button) findViewById(R.id.button3);
        Button b4=(Button) findViewById(R.id.button4);
        Button b5=(Button) findViewById(R.id.button5);

        b1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(APGapActivity.this, APSCActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(APGapActivity.this, APFCMActivity.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(APGapActivity.this, APPHMActivity.class);

            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(APGapActivity.this, APMarketingActivity.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(APGapActivity.this, APNMActivity.class);
                startActivity(intent);
            }
        });
    }
}