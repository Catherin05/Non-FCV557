package com.example.myapplication.NONFCV.Chewing.Gujarat.GInfra.GVarieties.GGap;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.NONFCV.Chewing.Bihar.BInfra.BVarieties.BGap.BVarietiesActivity;
import com.example.myapplication.NONFCV.Chewing.Bihar.BInfra.BVarieties.BGap.DP401Activity;
import com.example.myapplication.NONFCV.Chewing.Bihar.BInfra.BVarieties.BGap.GANDAKBAHARActivity;
import com.example.myapplication.NONFCV.Chewing.Bihar.BInfra.BVarieties.BGap.LICHCHAVIActivity;
import com.example.myapplication.NONFCV.Chewing.Bihar.BInfra.BVarieties.BGap.PRABHAActivity;
import com.example.myapplication.NONFCV.Chewing.Bihar.BInfra.BVarieties.BGap.PUSATOBACCO76Activity;
import com.example.myapplication.NONFCV.Chewing.Bihar.BInfra.BVarieties.BGap.SONAActivity;
import com.example.myapplication.NONFCV.Chewing.Bihar.BInfra.BVarieties.BGap.VAISHALISPECIALActivity;
import com.example.myapplication.R;

public class CGVarietiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cgvarieties);

        Button but1=(Button) findViewById(R.id.button1);
        Button but2=(Button) findViewById(R.id.button2);



        but1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(CGVarietiesActivity.this, GT8Activity.class);
                startActivity(intent);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(CGVarietiesActivity.this, GT6Activity.class);
                startActivity(intent);
            }
        });

    }
}