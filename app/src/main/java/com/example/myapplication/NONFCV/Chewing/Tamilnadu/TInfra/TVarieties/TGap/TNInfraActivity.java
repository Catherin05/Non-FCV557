package com.example.myapplication.NONFCV.Chewing.Tamilnadu.TInfra.TVarieties.TGap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.NONFCV.Chewing.Gujarat.GInfra.GVarieties.GGap.CGContactActivity;
import com.example.myapplication.NONFCV.Chewing.Gujarat.GInfra.GVarieties.GGap.CGInfraActivity;
import com.example.myapplication.NONFCV.Chewing.Gujarat.GInfra.GVarieties.GGap.CGStationActivity;
import com.example.myapplication.R;

public class TNInfraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tninfra);

        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TNInfraActivity.this, TNStationActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TNInfraActivity.this, TNContactActivity.class);
                startActivity(intent);
            }
        });
    }
}