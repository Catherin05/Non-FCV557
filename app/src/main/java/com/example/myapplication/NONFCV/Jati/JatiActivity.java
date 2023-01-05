package com.example.myapplication.NONFCV.Jati;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.myapplication.NONFCV.Jati.JInfra.JVarieties.JGap.JWestBengalActivity;
import com.example.myapplication.R;

public class JatiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jati);


        Button butt1=(Button) findViewById(R.id.button1);

        butt1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(JatiActivity.this, JWestBengalActivity.class);
                startActivity(intent);
            }
        });
    }
}