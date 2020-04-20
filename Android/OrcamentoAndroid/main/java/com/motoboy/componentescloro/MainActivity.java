package com.motoboy.componentescloro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent2 = getIntent();

        this.mViewHolder.nomeCliente = (EditText) this.findViewById(R.id.nome);
        this.mViewHolder.telefoneCliente = (EditText) this.findViewById(R.id.telefone);
        this.mViewHolder.spinnerCidade = (Spinner) this.findViewById(R.id.spinner_cidade);
        this.mViewHolder.endereco = (EditText) this.findViewById(R.id.endereco);
        this.mViewHolder.spinnerMarca = (Spinner) this.findViewById(R.id.spinner_marca);
        this.mViewHolder.quantidade = (EditText) this.findViewById(R.id.quantidade);
        this.mViewHolder.botaoOrcamento = (Button) this.findViewById(R.id.botaoSimular);

        this.mViewHolder.botaoOrcamento.setOnClickListener(this);
        this.loadSpinnerCidades();
        this.loadSpinnerMarcas();
    }

    @Override
    public void onClick(View v) {

        if (checked()) {
            SharedPreferences preferences = getSharedPreferences("preferencias", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = preferences.edit();

            editor.putString("nome", this.mViewHolder.nomeCliente.getText().toString());
            editor.putString("telefone", this.mViewHolder.telefoneCliente.getText().toString());
            editor.putString("cidade", this.mViewHolder.spinnerCidade.getSelectedItem().toString());
            editor.putString("endereco", this.mViewHolder.endereco.getText().toString());
            editor.putString("marca", this.mViewHolder.spinnerMarca.getSelectedItem().toString());
            editor.putString("quantidade", this.mViewHolder.quantidade.getText().toString());
            editor.apply();
            editor.commit();

            Intent intent = new Intent(this, ConfirmationActivity.class);
            startActivity(intent);
        } else {
            Toast.makeText(this, R.string.campo_null, Toast.LENGTH_LONG).show();
        }
    }

    private Boolean checked() {

        if (this.mViewHolder.nomeCliente.getText().toString().equals("")) {
            return false;
        } else if (this.mViewHolder.telefoneCliente.getText().toString().equals("")) {
            return false;
        } else if (this.mViewHolder.endereco.getText().toString().equals("")) {
            return false;
        } else if (!this.mViewHolder.quantidade.getText().toString().equals("")) {
            return true;
        }

        return true;

    }

    private void loadSpinnerCidades() {
        List<String> list = SpinnerLists.getCidades();

        ArrayAdapter<String> spinner = new ArrayAdapter<>(this, R.layout.spinner_layout, list);
        this.mViewHolder.spinnerCidade.setAdapter(spinner);
    }

    private void loadSpinnerMarcas() {
        List<String> list = SpinnerLists.getMarcas();

        ArrayAdapter<String> spinner = new ArrayAdapter<>(this, R.layout.spinner_layout, list);
        this.mViewHolder.spinnerMarca.setAdapter(spinner);
    }

    private static class ViewHolder {
        EditText nomeCliente;
        EditText telefoneCliente;
        Spinner spinnerCidade;
        EditText endereco;
        Spinner spinnerMarca;
        EditText quantidade;
        Button botaoOrcamento;
    }
}
