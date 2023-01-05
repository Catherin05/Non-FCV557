package com.example.myapplication.NONFCV.NatuPikka.NPInfra.NPVarieties.NpGap;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.NONFCV.NatuPikka.NInfra.NVarieties.NGap.NAPActivity;
import com.example.myapplication.NONFCV.NatuPikka.NInfra.NVarieties.NGap.NAVarietiesActivity;
import com.example.myapplication.NONFCV.NatuPikka.NInfra.NVarieties.NGap.NGapActivity;
import com.example.myapplication.NONFCV.NatuPikka.NInfra.NVarieties.NGap.NInfraActivity;
import com.example.myapplication.R;

public class OdishaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_odisha);

        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);
        Button b3=(Button) findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(OdishaActivity.this, OInfraActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(OdishaActivity.this, OVarietiesActivity.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(OdishaActivity.this, OGapActivity.class);
                startActivity(intent);
            }
        });



    }
}