package com.example.myapplication.NONFCV.Bidi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.NONFCV.Bidi.Karnataka.KInfra.Kvarieties.KGap.KGapActivity;
import com.example.myapplication.NONFCV.Bidi.Karnataka.KInfra.Kvarieties.KGap.KRInfraActivity;
import com.example.myapplication.NONFCV.Bidi.Karnataka.KInfra.Kvarieties.KGap.KVarietiesActivity;
import com.example.myapplication.R;

public class KarnatakaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_karnataka);
        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);
        Button b3=(Button) findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(KarnatakaActivity.this, KRInfraActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(KarnatakaActivity.this, KVarietiesActivity.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(KarnatakaActivity.this, KGapActivity.class);
                startActivity(intent);
            }
        });
    }
}