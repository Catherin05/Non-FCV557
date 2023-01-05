package com.example.myapplication.NONFCV.Cheroot;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.NONFCV.Burley.AP.APInfra.APVarieties.APGap.APActivity;
import com.example.myapplication.NONFCV.Burley.BurleyActivity;
import com.example.myapplication.NONFCV.Cheroot.ChInfra.ChVarieties.ChGap.ChTamilNaduActivity;
import com.example.myapplication.R;

public class CherootActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheroot);


        Button butt1=(Button) findViewById(R.id.cheroot_tamil);

        butt1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(CherootActivity.this, ChTamilNaduActivity.class);
                startActivity(intent);
            }
        });
    }
}