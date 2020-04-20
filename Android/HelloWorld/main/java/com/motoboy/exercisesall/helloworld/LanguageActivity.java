package com.motoboy.exercisesall.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.motoboy.exercisesall.R;


public class LanguageActivity extends AppCompatActivity {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.language_activity);

        this.mViewHolder.textHello = (TextView) this.findViewById(R.id.title_hello);

        this.choseLanguage();
    }

    public void choseLanguage() {
        String hello;
        Intent intent = getIntent();
        Bundle dados = intent.getExtras();

        if (dados != null) {

            int position = dados.getInt("Position");

            if (position == dados.getInt("Position 0")) {
                hello = dados.getString("Spanish");
                this.mViewHolder.textHello.setText(hello);
            } else if (position == dados.getInt("Position 1")) {
                hello = dados.getString("Nianja");
                this.mViewHolder.textHello.setText(hello);
            } else if (position == dados.getInt("Position 2")) {
                hello = dados.getString("Italian");
                this.mViewHolder.textHello.setText(hello);
            } else if (position == dados.getInt("Position 3")) {
                hello = dados.getString("Japanese");
                this.mViewHolder.textHello.setText(hello);
            }
        }

    }

    private static class ViewHolder {
        TextView textHello;
    }
}
