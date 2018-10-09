package com.example.propietario.persistenciadb;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.widget.TextView;

import com.example.propietario.persistenciadb.application.BaseAplication;

public class ListActivity extends AppCompatActivity {

    private TextView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lista);
        lista=(TextView)findViewById(R.id.tvlista);

        for(String it:((BaseAplication)getApplication()).nombresClientes()){
            lista.setText(lista.getText()+it);
        }
    }


}
