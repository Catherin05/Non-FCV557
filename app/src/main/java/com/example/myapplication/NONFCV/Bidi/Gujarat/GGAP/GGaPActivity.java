package com.example.myapplication.NONFCV.Bidi.Gujarat.GGAP;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.NONFCV.Bidi.AP.GAP.FCMActivity;
import com.example.myapplication.NONFCV.Bidi.AP.GAP.GAPActivity;
import com.example.myapplication.NONFCV.Bidi.AP.GAP.MarketActivity;
import com.example.myapplication.NONFCV.Bidi.AP.GAP.NMActivity;
import com.example.myapplication.NONFCV.Bidi.AP.GAP.PHMActivity;
import com.example.myapplication.NONFCV.Bidi.AP.GAP.SoCActivity;
import com.example.myapplication.R;

public class GGaPActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gga_pactivity);
        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);
        Button b3=(Button) findViewById(R.id.button3);
        Button b4=(Button) findViewById(R.id.button4);
        Button b5=(Button) findViewById(R.id.button5);

        b1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GGaPActivity.this, GsoCActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GGaPActivity.this, GnMActivity.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GGaPActivity.this, GfcMActivity.class);
                startActivity(intent);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GGaPActivity.this, GphMActivity.class);
                startActivity(intent);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GGaPActivity.this, GmarketActivity.class);
                startActivity(intent);
            }
        });
    }
}