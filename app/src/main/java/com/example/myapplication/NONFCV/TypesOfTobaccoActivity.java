package com.example.myapplication.NONFCV;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.NONFCV.Bidi.BidiActivity;
import com.example.myapplication.NONFCV.Burley.BurleyActivity;
import com.example.myapplication.NONFCV.Cheroot.CherootActivity;
import com.example.myapplication.NONFCV.Chewing.ChewingActivity;

import com.example.myapplication.NONFCV.Jati.JatiActivity;
import com.example.myapplication.NONFCV.Lanka.LankaActivity;
import com.example.myapplication.NONFCV.Motihari.MotihariActivity;
import com.example.myapplication.NONFCV.NatuPikka.NatuPikkaActivity;
import com.example.myapplication.NONFCV.Oriental.OrientalActivity;
import com.example.myapplication.NONFCV.Rustica.RusticaActivity;
import com.example.myapplication.R;

public class TypesOfTobaccoActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types_of_tobacco);

        Button but1=(Button) findViewById(R.id.button1);
        Button but2=(Button) findViewById(R.id.button2);
        Button but3=(Button) findViewById(R.id.button3);
        Button but4=(Button) findViewById(R.id.button4);
       // Button but5=(Button) findViewById(R.id.button5);
        Button but6=(Button) findViewById(R.id.button6);
        Button but7=(Button) findViewById(R.id.button7);
        Button but8=(Button) findViewById(R.id.button8);
        Button but9=(Button) findViewById(R.id.button9);
        Button but10=(Button) findViewById(R.id.button10);
        Button but11=(Button) findViewById(R.id.button11);

        but1.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TypesOfTobaccoActivity.this, BidiActivity.class);
                startActivity(intent);
            }
        });
        but2.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TypesOfTobaccoActivity.this, BurleyActivity.class);
                startActivity(intent);
            }
        });
        but3.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TypesOfTobaccoActivity.this, ChewingActivity.class);
                startActivity(intent);
            }
        });
        but4.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TypesOfTobaccoActivity.this, CherootActivity.class);
                startActivity(intent);
            }
        });
       /* but5.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TypesOfTobaccoActivity.this, CigarActivity.class);
                startActivity(intent);
            }
        });
        */
        but6.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TypesOfTobaccoActivity.this, JatiActivity.class);
                startActivity(intent);
            }
        });
        but7.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TypesOfTobaccoActivity.this, LankaActivity.class);
                startActivity(intent);
            }
        });
        but8.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TypesOfTobaccoActivity.this, MotihariActivity.class);
                startActivity(intent);
            }
        });
        but9.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TypesOfTobaccoActivity.this, NatuPikkaActivity.class);
                startActivity(intent);
            }
        });
        but10.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TypesOfTobaccoActivity.this,OrientalActivity .class);
                startActivity(intent);
            }
        });
        but11.setOnClickListener(new View.OnClickListener() {
            private Intent packagecontext;

            @Override
            public void onClick(View v) {

                Intent intent=new Intent(TypesOfTobaccoActivity.this, RusticaActivity.class);
                startActivity(intent);
            }
        });




    }
}