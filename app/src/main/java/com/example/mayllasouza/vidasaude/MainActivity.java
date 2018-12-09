package com.example.mayllasouza.vidasaude;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;
import java.util.List;


public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView l = new ListView(this);
        setContentView(l);
        List<String> lista = Arrays.asList("Alergista","Alergista","Alergista","Alergista","Alergista","Alergista");
        l.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, lista));
        l.setOnItemClickListener(this);

    }


    public void abrirListaEspecialidades(View view) {
        Intent i = new Intent(this, DoctorsActivity.class);
        startActivity(i);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        abrirListaEspecialidades(null);
    }
}
