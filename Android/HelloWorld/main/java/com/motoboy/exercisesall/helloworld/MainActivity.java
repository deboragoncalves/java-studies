package com.motoboy.exercisesall.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.motoboy.exercisesall.R;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.mSpinnerDinamic = (Spinner) this.findViewById(R.id.spinner);
        this.mViewHolder.mButton = (Button) this.findViewById(R.id.button_click);

        this.mViewHolder.mButton.setOnClickListener(this);
        this.mViewHolder.mSpinnerDinamic.setOnItemSelectedListener(this);
        this.loadSpinner();
    }

    public void loadSpinner() {
        List<String> list = ListSpinner.getLanguages();

        ArrayAdapter<String> spinner = new ArrayAdapter<>(this, R.layout.spinner_layout, list);
        this.mViewHolder.mSpinnerDinamic.setAdapter(spinner);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, LanguageActivity.class);
        Bundle dados = new Bundle();

        String helloSpanish = "Hola mundo";
        String helloItalian = "Ciao mondo";
        String helloNianja = "Moni Mdziko";
        String helloJapanese = "こんにちは世界";

        int posicao = this.mViewHolder.mSpinnerDinamic.getSelectedItemPosition();
        dados.putInt("Position", posicao);

        if (posicao == 0) {
            dados.putString("Spanish", helloSpanish);
            dados.putInt("Position 0", posicao);
            intent.putExtras(dados);
            startActivity(intent);
        } else if (posicao == 1) {
            dados.putString("Nianja", helloNianja);
            dados.putInt("Position 1", posicao);
            intent.putExtras(dados);
            startActivity(intent);
        } else if (posicao == 2) {
            dados.putString("Italian", helloItalian);
            dados.putInt("Position 2", posicao);
            intent.putExtras(dados);
            startActivity(intent);
        } else if (posicao == 3) {
            dados.putString("Japanese", helloJapanese);
            dados.putInt("Position 3", posicao);
            intent.putExtras(dados);
            startActivity(intent);
        }

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String language = this.mViewHolder.mSpinnerDinamic.getSelectedItem().toString();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        return;
    }

    private static class ViewHolder {
        private Spinner mSpinnerDinamic;
        private Button mButton;
    }
}
