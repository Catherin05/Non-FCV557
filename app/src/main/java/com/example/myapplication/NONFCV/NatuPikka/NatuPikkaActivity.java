package com.example.myapplication.NONFCV.NatuPikka;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.NONFCV.Chewing.Bihar.BInfra.BVarieties.BGap.BiharActivity;
import com.example.myapplication.NONFCV.Chewing.ChewingActivity;
import com.example.myapplication.NONFCV.Chewing.Gujarat.GInfra.GVarieties.GGap.GujaratActivity;
import com.example.myapplication.NONFCV.Chewing.Tamilnadu.TInfra.TVarieties.TGap.TamilNaduActivity;
import com.example.myapplication.NONFCV.NatuPikka.NInfra.NVarieties.NGap.NAPActivity;
import com.example.myapplication.NONFCV.NatuPikka.NPInfra.NPVarieties.NpGap.OdishaActivity;
import com.example.myapplication.R;

public class NatuPikkaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_natu_pikka);

        Button butt1=(Button) findViewById(R.id.button1);
        Button butt2=(Button) findViewById(R.id.button2);

        butt1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(NatuPikkaActivity.this, NAPActivity.class);
                startActivity(intent);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(NatuPikkaActivity.this, OdishaActivity.class);
                startActivity(intent);
            }
        });

    }
}