package com.motoboy.componentescloro;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;

public class FinalActivity extends AppCompatActivity implements View.OnClickListener {

    private double taxa_entrega;
    private double preco_unit = 0.0;
    private double preco_total = 0.0;
    private ViewHolder mViewHolder = new ViewHolder();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.final_activity);

        this.mViewHolder.textTaxa = (TextView) this.findViewById(R.id.mostrar_taxa);
        this.mViewHolder.textPrecoUnit = (TextView) this.findViewById(R.id.mostrar_precounit);
        this.mViewHolder.textPrecoTotal = (TextView) this.findViewById(R.id.mostrar_precototal);
        this.mViewHolder.textCidade = (TextView) this.findViewById(R.id.mostrar_cidade);
        this.mViewHolder.textMarca = (TextView) this.findViewById(R.id.mostrar_marca);
        this.mViewHolder.textQuantidade = (TextView) this.findViewById(R.id.mostrar_quantidade);
        this.mViewHolder.botaoNovo = (Button) this.findViewById(R.id.botaoNovo);
        this.mViewHolder.botaoConfirmar = (Button) this.findViewById(R.id.botaoConfirmarPedido);

        Intent intent = getIntent();

        this.mostrarDados();
        this.mViewHolder.botaoNovo.setOnClickListener(this);
        this.mViewHolder.botaoConfirmar.setOnClickListener(this);

    }

    public void calcPreco() {
        SharedPreferences preferences = getSharedPreferences("preferencias", Context.MODE_PRIVATE);
        String cidade = preferences.getString("cidade", "não encontrado");
        String marca = preferences.getString("marca", "não encontrado");
        int quantidade = Integer.parseInt(preferences.getString("quantidade", "não encontrado"));

        // Preco Marca e quantidade

        // Hidroall 10kg

        if (marca.equals("Hidroall")) {
            preco_unit = 155.00;

            if (quantidade <= 5) {
                preco_total = preco_unit * quantidade;
            } else if (quantidade <= 10) {
                preco_unit -= 0.05;
                preco_total = preco_unit * quantidade;
            } else if (quantidade <= 20) {
                preco_unit -= 0.10;
                preco_total = preco_unit * quantidade;
            } else if (quantidade <= 30) {
                preco_unit -= 0.15;
                preco_total = preco_unit * quantidade;
            } else {
                preco_unit -= 0.20;
                preco_total = preco_unit * quantidade;
            }
        }

        // Genco 10kg

        if (marca.equals("Genco")) {
            preco_unit = 140.00;

            if (quantidade <= 5) {
                preco_total = preco_unit * quantidade;
            } else if (quantidade <= 10) {
                preco_unit -= 0.05;
                preco_total = preco_unit * quantidade;
            } else if (quantidade <= 20) {
                preco_unit -= 0.10;
                preco_total = preco_unit * quantidade;
            } else if (quantidade <= 30) {
                preco_unit -= 0.15;
                preco_total = preco_unit * quantidade;
            } else {
                preco_unit -= 0.20;
                preco_total = preco_unit * quantidade;
            }
        }

        // Pace 10kg 160

        if (marca.equals("Pace")) {
            preco_unit = 160.00;

            if (quantidade <= 5) {
                preco_total = preco_unit * quantidade;
            } else if (quantidade <= 10) {
                preco_unit -= 0.05;
                preco_total = preco_unit * quantidade;
            } else if (quantidade <= 20) {
                preco_unit -= 0.10;
                preco_total = preco_unit * quantidade;
            } else if (quantidade <= 30) {
                preco_unit -= 0.15;
                preco_total = preco_unit * quantidade;
            } else {
                preco_unit -= 0.20;
                preco_total = preco_unit * quantidade;
            }
        }

        // Hidro Azul 10kg 150

        if (marca.equals("Hidro Azul")) {
            preco_unit = 150.00;

            if (quantidade <= 5) {
                preco_total = preco_unit * quantidade;
            } else if (quantidade <= 10) {
                preco_unit -= 0.05;
                preco_total = preco_unit * quantidade;
            } else if (quantidade <= 20) {
                preco_unit -= 0.10;
                preco_total = preco_unit * quantidade;
            } else if (quantidade <= 30) {
                preco_unit -= 0.15;
                preco_total = preco_unit * quantidade;
            } else {
                preco_unit -= 0.20;
                preco_total = preco_unit * quantidade;
            }
        }

        // Limper 10kg 120

        if (marca.equals("Limper")) {
            preco_unit = 120.00;

            if (quantidade <= 5) {
                preco_total = preco_unit * quantidade;
            } else if (quantidade <= 10) {
                preco_unit -= 0.05;
                preco_total = preco_unit * quantidade;
            } else if (quantidade <= 20) {
                preco_unit -= 0.10;
                preco_total = preco_unit * quantidade;
            } else if (quantidade <= 30) {
                preco_unit -= 0.15;
                preco_total = preco_unit * quantidade;
            } else {
                preco_unit -= 0.20;
                preco_total = preco_unit * quantidade;
            }
        }

        // Taxa de entrega;

        if (cidade.equals("Joinville")) {
            taxa_entrega = 10.00;
            preco_total += taxa_entrega;
        } else if (cidade.equals("Florianópolis") || cidade.equals("Balneário Camboriú")) {
            taxa_entrega = 12.00;
            preco_total += taxa_entrega;
        } else {
            taxa_entrega = 15.00;
            preco_total += taxa_entrega;
        }

    }

    @SuppressLint("SetTextI18n")
    private void mostrarDados() {
        this.calcPreco();
        String taxa = String.valueOf(this.taxa_entrega);
        String precoUnit = String.valueOf(this.preco_unit);

        DecimalFormat decimalFormat = new DecimalFormat("###.00");
        String precoTotal = decimalFormat.format(this.preco_total);

        SharedPreferences preferences = getSharedPreferences("preferencias", Context.MODE_PRIVATE);
        this.mViewHolder.textCidade.setText("Cidade: " + preferences.getString("cidade", "não encontrado"));
        this.mViewHolder.textMarca.setText("Marca: " + preferences.getString("marca", "não encontrado"));
        this.mViewHolder.textQuantidade.setText("Quantidade: " + preferences.getString("quantidade", "não encontrado"));

        this.mViewHolder.textTaxa.setText("Taxa de entrega: R$ " + taxa);
        this.mViewHolder.textPrecoUnit.setText("Preço unitário: R$ " + precoUnit);
        this.mViewHolder.textPrecoTotal.setText("Preço total: R$ " + precoTotal);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.botaoConfirmarPedido) {
            Toast.makeText(this, R.string.alert_thanks, Toast.LENGTH_LONG).show();
        } else if (id == R.id.botaoNovo) {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }

    private static class ViewHolder {
        TextView textTaxa;
        TextView textPrecoUnit;
        TextView textPrecoTotal;
        TextView textCidade;
        TextView textMarca;
        TextView textQuantidade;
        Button botaoNovo;
        Button botaoConfirmar;
    }

}
