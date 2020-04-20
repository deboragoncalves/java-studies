package com.motoboy.nameslist;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class AddActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_name);

        this.mViewHolder.saveName = (Button) this.findViewById(R.id.button_salve);
        this.mViewHolder.name = (EditText) this.findViewById(R.id.edit_name);

        this.mViewHolder.saveName.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        Intent intent = getIntent();
        Bundle dados = intent.getExtras();

        if (dados != null) {

            if (id == R.id.button_salve) {
                SharedPreferences preferences = getSharedPreferences("preferencias", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();

                if (this.mViewHolder.name.getText().toString().equals("")) {
                    Toast.makeText(this, R.string.edit_null, Toast.LENGTH_LONG).show();
                } else {
                    editor.putString("nome", this.mViewHolder.name.getText().toString());
                    editor.apply();
                    editor.commit();

                    Toast.makeText(this, R.string.sucess_add, Toast.LENGTH_LONG).show();
                    super.onBackPressed();
                }
            }
        }
    }

    private static class ViewHolder {
        Button saveName;
        EditText name;
    }

}




