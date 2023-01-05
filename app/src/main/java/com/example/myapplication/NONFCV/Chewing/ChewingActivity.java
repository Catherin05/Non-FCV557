package com.example.myapplication.NONFCV.Chewing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.NONFCV.Chewing.Bihar.BInfra.BVarieties.BGap.BiharActivity;
import com.example.myapplication.NONFCV.Chewing.Gujarat.GInfra.GVarieties.GGap.GujaratActivity;
import com.example.myapplication.NONFCV.Chewing.Tamilnadu.TInfra.TVarieties.TGap.TamilNaduActivity;
import com.example.myapplication.R;

public class ChewingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chewing);

        Button butt1=(Button) findViewById(R.id.button1);
        Button butt2=(Button) findViewById(R.id.button2);
        Button butt3=(Button) findViewById(R.id.button3);

        butt1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ChewingActivity.this, BiharActivity.class);
                startActivity(intent);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ChewingActivity.this, GujaratActivity.class);
                startActivity(intent);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(ChewingActivity.this, TamilNaduActivity.class);
                startActivity(intent);
            }
        });
    }
}