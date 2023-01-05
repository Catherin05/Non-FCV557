package com.example.myapplication.NONFCV.Bidi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class BidiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bidi);

        Button butt1=(Button) findViewById(R.id.button1);
        Button butt2=(Button) findViewById(R.id.button2);
        Button butt3=(Button) findViewById(R.id.button3);

        butt1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BidiActivity.this, ApActivity.class);
                startActivity(intent);
            }
        });
        butt2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BidiActivity.this, GujaratActivity.class);
                startActivity(intent);
            }
        });
        butt3.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(BidiActivity.this, KarnatakaActivity.class);
                startActivity(intent);
            }
        });
    }
}