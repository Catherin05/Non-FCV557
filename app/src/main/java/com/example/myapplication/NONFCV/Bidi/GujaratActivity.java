package com.example.myapplication.NONFCV.Bidi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.example.myapplication.NONFCV.Bidi.Gujarat.GGAP.GGaPActivity;
import com.example.myapplication.NONFCV.Bidi.Gujarat.GInfra.GResearchInfrastructureActivity;
import com.example.myapplication.NONFCV.Bidi.Gujarat.GVarieties.GVarietiesActivity;
import com.example.myapplication.R;

public class GujaratActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gujarat);

        Button b1=(Button) findViewById(R.id.button1);
        Button b2=(Button) findViewById(R.id.button2);
        Button b3=(Button) findViewById(R.id.button3);

        b1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GujaratActivity.this, GResearchInfrastructureActivity.class);
                startActivity(intent);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GujaratActivity.this, GVarietiesActivity.class);
                startActivity(intent);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(GujaratActivity.this, GGaPActivity.class);
                startActivity(intent);
            }
        });
    }
}

