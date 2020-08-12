package com.motoboy.nameslist;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.gson.Gson;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, AdapterView.OnItemClickListener, AdapterView.OnItemLongClickListener {

    private ViewHolder mViewHolder = new ViewHolder();
    public ArrayList<String> listaNomes;
    public ArrayAdapter<String> adapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mViewHolder.listaNomes = (ListView) findViewById(R.id.lista_nomes);
        this.mViewHolder.addName = (ImageView) findViewById(R.id.button_add);

        this.mViewHolder.addName.setOnClickListener(this);
        this.mViewHolder.listaNomes.setOnItemClickListener(this);
        this.mViewHolder.listaNomes.setOnItemLongClickListener(this);
    }

    @Override
    protected void onResume() {
        super.onResume();
        this.addItemList();
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        String nome = listaNomes.get(position);
        Intent i = new Intent(MainActivity.this, NomeActivity.class);
        i.putExtra("nome", nome);
        startActivity(i);
    }

    @Override
    public boolean onItemLongClick(AdapterView<?> parent, View view, final int position, long id) {
        final String nome = listaNomes.get(position);
        new AlertDialog.Builder(this)
                .setTitle(R.string.remover)
                .setMessage(R.string.deseja_remover)
                .setPositiveButton(R.string.sim, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        listaNomes.remove(nome);
                        adapter.notifyDataSetChanged();
                        Toast.makeText(MainActivity.this, R.string.sucess_remove, Toast.LENGTH_LONG).show();
                    }
                }).setNegativeButton(R.string.cancelar, null).show();
        return true;
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.button_add) {
            Intent intent = new Intent(this, AddActivity.class);
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("lista", listaNomes);
            intent.putExtras(bundle);
            startActivity(intent);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        if (listaNomes == null) {
            listaNomes = Nomes.allNames();
            adapter = new ArrayAdapter<String>(this, R.layout.list_layout, listaNomes);
            this.mViewHolder.listaNomes.setAdapter(adapter);
        }
    }

    public void addItemList() {
        SharedPreferences preferences = getSharedPreferences("preferencias", Context.MODE_PRIVATE);
        listaNomes.add(preferences.getString("nome", "não encontrado"));
        adapter.notifyDataSetChanged();
    }

    private static class ViewHolder {
        ListView listaNomes;
        ImageView addName;
    }

}




