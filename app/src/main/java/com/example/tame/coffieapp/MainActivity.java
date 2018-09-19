package com.example.tame.coffieapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;
    float precio = (float) 0.0;
    TextView ncount;
    TextView ntotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ncount = findViewById(R.id.ncount);
        ntotal = findViewById(R.id.ntotal);
    }


    public void btncount(View view) {
        count+=1;
        ncount.setText(""+count);
        precio=0.8f*count;
        ntotal.setText(""+precio);

    }

    public void btneliminar(View view) {
        count=0;
        ncount.setText(String.valueOf(count));
        precio=0.0f;
        ntotal.setText(String.valueOf(precio));
    }
}

