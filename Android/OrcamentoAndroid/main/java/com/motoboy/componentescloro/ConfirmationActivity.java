package com.motoboy.componentescloro;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ConfirmationActivity extends AppCompatActivity implements View.OnClickListener {

    private ViewHolder mViewHolder = new ViewHolder();

    @SuppressLint("SetTextI18n")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirmation_activity);

        this.mViewHolder.textName = (TextView) this.findViewById(R.id.nome_confirmation);
        this.mViewHolder.textTelefone = (TextView) this.findViewById(R.id.telefone_confirmation);
        this.mViewHolder.textEndereco = (TextView) this.findViewById(R.id.endereco_confirmation);
        this.mViewHolder.textCidade = (TextView) this.findViewById(R.id.cidade_confirmation);
        this.mViewHolder.textMarca = (TextView) this.findViewById(R.id.spinnerM_confirmation);
        this.mViewHolder.textQuantidade = (TextView) this.findViewById(R.id.quantidade_confirmation);
        this.mViewHolder.botaoVoltar = (Button) this.findViewById(R.id.botaoVoltar);
        this.mViewHolder.botaoConfirmar = (Button) this.findViewById(R.id.botaoConfirmar);

        Intent intent = getIntent();

        this.mostrarDados();
        this.mViewHolder.botaoVoltar.setOnClickListener(this);
        this.mViewHolder.botaoConfirmar.setOnClickListener(this);
    }

    @SuppressLint("SetTextI18n")
    private void mostrarDados() {
        SharedPreferences preferences = getSharedPreferences("preferencias", Context.MODE_PRIVATE);
        this.mViewHolder.textName.setText("Nome: " + preferences.getString("nome", "não encontrado"));
        this.mViewHolder.textTelefone.setText("Telefone: " + preferences.getString("telefone", "não encontrado"));
        this.mViewHolder.textCidade.setText("Cidade: " + preferences.getString("cidade", "não encontrado"));
        this.mViewHolder.textEndereco.setText("Endereço: " + preferences.getString("endereco", "não encontrado"));
        this.mViewHolder.textMarca.setText("Marca: " + preferences.getString("marca", "não encontrado"));
        this.mViewHolder.textQuantidade.setText("Quantidade: " + preferences.getString("quantidade", "não encontrado"));
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.botaoConfirmar) {
            Intent intent = new Intent(this, FinalActivity.class);
            startActivity(intent);
        } else if (id == R.id.botaoVoltar) {
            super.onBackPressed();
        }
    }

    private static class ViewHolder {
        TextView textName;
        TextView textTelefone;
        TextView textCidade;
        TextView textEndereco;
        TextView textMarca;
        TextView textQuantidade;
        Button botaoVoltar;
        Button botaoConfirmar;
    }
}
