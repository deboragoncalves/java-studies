package com.motoboy.nameslist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class NomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.one_name);

        Intent i1 = getIntent();
        String s1 = i1.getStringExtra("nome");

        TextView texto = (TextView) findViewById(R.id.aName);
        texto.setText(s1);
    }
}
