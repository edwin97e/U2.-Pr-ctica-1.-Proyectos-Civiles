package com.example.evera.tpdm_u2_practica1_edwin_ponce;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.sql.SQLException;

public class Main3Activity extends AppCompatActivity {

    EditText bucapordescripcion;
    TextView descripcion,ubicacion,fecha,presupuesto;
    Button consultar;
    Civil base;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        bucapordescripcion = findViewById(R.id.descripcion2);
        descripcion = findViewById(R.id.rdescripcion);
        ubicacion = findViewById(R.id.rubicacion);
        fecha = findViewById(R.id.rfecha);
        presupuesto = findViewById(R.id.rpresupuesto);

        base = new Civil(this,"Civil",null,1);
        consultar = findViewById(R.id.consultar);

        consultar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Consulta();
            }
        });
    }
    public void Consulta(){
        try {
            SQLiteDatabase consult = base.getReadableDatabase();
            String SQL = "SELECT * FROM"
        }catch (SQLiteException e){

        }
    }
}
