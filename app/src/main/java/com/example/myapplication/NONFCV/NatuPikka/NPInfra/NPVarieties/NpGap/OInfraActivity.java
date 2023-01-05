package com.example.myapplication.NONFCV.NatuPikka.NPInfra.NPVarieties.NpGap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.NONFCV.NatuPikka.NInfra.NVarieties.NGap.NContactActivity;
import com.example.myapplication.NONFCV.NatuPikka.NInfra.NVarieties.NGap.NInfraActivity;
import com.example.myapplication.NONFCV.NatuPikka.NInfra.NVarieties.NGap.NStationActivity;
import com.example.myapplication.R;

public class OInfraActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oinfra);

        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(OInfraActivity.this, OStationActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(OInfraActivity.this, OcontactActivity.class);
                startActivity(intent);
            }
        });
    }
}