package com.example.myapplication.NONFCV.Burley.AP.APInfra.APVarieties.APGap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.NONFCV.Bidi.AP.GAP.GAPActivity;
import com.example.myapplication.NONFCV.Bidi.AP.RInfra.ResearchInfrastructureActivity;
import com.example.myapplication.NONFCV.Bidi.AP.varieties.VarietiesActivity;
import com.example.myapplication.NONFCV.Bidi.ApActivity;
import com.example.myapplication.R;

public class APActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apactivity);

        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);
        Button b3=(Button) findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(APActivity.this, APRInfraActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(APActivity.this, APVarietiesActivity.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(APActivity.this, APGapActivity.class);
                startActivity(intent);
            }
        });
    }
}


