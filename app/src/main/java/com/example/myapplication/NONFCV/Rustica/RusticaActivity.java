package com.example.myapplication.NONFCV.Rustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.NONFCV.NatuPikka.NInfra.NVarieties.NGap.NAPActivity;
import com.example.myapplication.NONFCV.NatuPikka.NPInfra.NPVarieties.NpGap.OdishaActivity;
import com.example.myapplication.NONFCV.NatuPikka.NatuPikkaActivity;
import com.example.myapplication.NONFCV.Rustica.RInfra.RVarieties.RGap.RGujaratActivity;
import com.example.myapplication.NONFCV.Rustica.UTInfra.UTVarieties.UTGap.UttarPradeshActivity;
import com.example.myapplication.R;

public class RusticaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rustica);

        Button butt1=(Button) findViewById(R.id.button1);
        Button butt2=(Button) findViewById(R.id.button2);

        butt1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RusticaActivity.this, RGujaratActivity.class);
                startActivity(intent);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(RusticaActivity.this, UttarPradeshActivity.class);
                startActivity(intent);
            }
        });
    }
}